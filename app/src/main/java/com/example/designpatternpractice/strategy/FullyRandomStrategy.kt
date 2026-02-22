package com.example.designpatternpractice.strategy

import kotlin.random.Random

// 【Strategyパターン】
// ConcreteStrategy（具体的な戦略）クラス: 完全ランダム戦略
// 過去の結果を一切学習せず、常にランダムに推測・回答する。
// Strategy インターフェースを実装することで、Player から差し替え可能になる。
class FullyRandomStrategy: Strategy {

    // 過去の正解に関わらず、毎回ランダムに推測する
    override fun guessAnswer(): Int {
        return Random.nextInt(1, 6)
    }

    // 完全ランダム戦略では正解を受け取っても学習しない
    override fun receiveAnswer(answer: Int) {
        return
    }

    // 過去の推測に関わらず、毎回ランダムに答えをセットする
    override fun setAnswer(): Int {
        return Random.nextInt(1, 6)
    }

    // 完全ランダム戦略では相手の推測結果を受け取っても学習しない
    override fun learnAnswer(answer: Int) {return}
}