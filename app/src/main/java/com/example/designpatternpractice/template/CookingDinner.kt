package com.example.designpatternpractice.template

/**
 * 夕食の調理手順を定義する抽象クラス
 * Template Method パターンにおける AbstractClass に相当する
 * サブクラス（ConcreteClass）は各ステップの具体的な処理を実装する
 */
abstract class CookingDinner {
    /**
     * Template メソッド
     * 料理の手順（prepare → cut → heat → serving）を定義する
     * サブクラスで手順の順番を変更できないよう、open にしない（final）
     */
    fun cook() { // openをつけないことで子クラスが修正できないようにする。
        prepare()
        cut()
        heat()
        serving()
    }

    abstract fun prepare()
    abstract fun cut()
    abstract fun heat()

    /**
     * デフォルト実装を持つフックメソッド。サブクラスで必要に応じてオーバーライドできる
     */
    open fun serving() {
        println("プレートに盛り付けて提供")
    }
}