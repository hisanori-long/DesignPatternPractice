package com.example.designpatternpractice.strategy

// 【Strategyパターン】
// Strategy（戦略）インターフェース
// アルゴリズム（戦略）の共通インターフェースを定義する。
// ConcreteStrategy（具体的な戦略クラス）はこのインターフェースを実装する。
// Context（Player）はこのインターフェースを通じて戦略を使うため、
// 具体的な戦略クラスを知らなくても動作できる。
interface Strategy {
    // 相手の答えを推測して返す
    fun guessAnswer(): Int

    // 相手の正解を受け取り、次回の推測に活かす
    fun receiveAnswer(answer: Int)

    // 自分が答えとしてセットする数字を返す
    fun setAnswer(): Int

    // 相手の推測の正解を受け取り、次回の答え設定に活かす
    fun learnAnswer(answer: Int)
}