package com.example.designpatternpractice.strategy

// 【Strategyパターン】
// Context（文脈）クラス
// Strategy インターフェースを保持し、戦略に処理を委譲する。
// 具体的な戦略クラス（FullyRandomStrategy など）を直接知らず、
// Strategy インターフェースを通じてのみやり取りする。
// これにより、戦略クラスを差し替えても Player のコードは変わらない。
class Player(val strategy: Strategy) {
    var winCount = 0
    var loseCount = 0

    // 戦略に従って答えをセットする
    // どの数字をセットするかは Strategy に委譲するため、Player は関与しない
    fun setAnswer(){
        val answer = strategy.setAnswer()
        GuessNumber.setAnswer(answer)
    }

    // 戦略に従って相手の答えを推測する
    // 推測結果（正解かどうか、正解の数字）を戦略にフィードバックし、学習させる
    fun guess() {
        val answer = strategy.guessAnswer()
        val result: Pair<Boolean, Int> = GuessNumber.guess(answer)
        strategy.learnAnswer(result.second)
        if (result.first) winCount += 1
        else loseCount += 1
    }
}