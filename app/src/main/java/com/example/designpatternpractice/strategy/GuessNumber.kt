package com.example.designpatternpractice.strategy

// 数当てゲームのロジックを管理するオブジェクト
// Strategyパターンにおける「ゲームのルール」を担う。
// Player や Strategy から独立しており、答えの管理と判定のみを責務とする。
object GuessNumber {
    private var answerNumber: Int = 0

    // 推測した数字が正解かどうかを判定する
    // 戻り値: Pair<正解かどうか, 正解の数字>
    fun guess(guessNumber: Int): Pair<Boolean, Int> {
        return Pair(guessNumber == answerNumber, answerNumber)
    }

    // 答えをセットする
    // 1〜5 の範囲外の場合は IllegalArgumentException を投げる
    fun setAnswer(answerNumber: Int){
        if (answerNumber !in 1..5) throw IllegalArgumentException()
        this.answerNumber = answerNumber
    }
}