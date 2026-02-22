package com.example.designpatternpractice.strategy

import kotlin.random.Random

// 【Strategyパターン】
// ConcreteStrategy（具体的な戦略）クラス: 頻出数字優先戦略
// 過去に正解だった数字をリストに追加していくことで出現頻度を高め、
// その数字が選ばれやすくなるように学習する戦略。
// Strategy インターフェースを実装することで、Player から差し替え可能になる。
class CountFrequentNumberStrategy: Strategy {
    // 推測候補リスト: 正解が追加されるほど、その数字が選ばれやすくなる
    private val guessAnswerList = mutableListOf<Int>(1, 2, 3, 4, 5)

    // 答え候補リスト: 相手の推測の正解が追加されるほど、その数字が選ばれやすくなる
    private val setAnswerList = mutableListOf<Int>(1, 2, 3, 4, 5)

    // guessAnswerList からランダムに1つ選んで推測する
    // 正解が追加されるほど、その数字の出現確率が上がる
    override fun guessAnswer(): Int {
        val randomIndex = Random.nextInt(0, guessAnswerList.size - 1)
        return guessAnswerList[randomIndex]
    }

    // 正解を guessAnswerList に追加して学習する
    // 追加するほどその数字がリスト内に増え、次回選ばれやすくなる
    override fun receiveAnswer(answer: Int) {
        guessAnswerList.add(answer)
    }

    // setAnswerList からランダムに1つ選んで答えとしてセットする
    override fun setAnswer(): Int {
        val randomIndex = Random.nextInt(0, setAnswerList.size - 1)
        return setAnswerList[randomIndex]
    }

    // 相手の推測の正解を guessAnswerList に追加して学習する
    override fun learnAnswer(answer: Int) {
        guessAnswerList.add(answer)
    }
}