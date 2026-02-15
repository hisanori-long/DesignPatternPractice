package com.example.designpatternpractice.singleton

import org.junit.Test

class SingletonTest {

    /**
     * Javaスタイル: getInstance()で取得した2つの参照が同一インスタンスであることを検証
     * === は参照の同一性（同じオブジェクト）を比較する演算子
     */
    @Test
    fun singletonTest() {
        println("Start")
        val obj1 = Singleton.getInstance()
        val obj2 = Singleton.getInstance()

        // ==（equals）ではなく ===（参照同一性）で検証するのがポイント
        assert(obj1 === obj2)
        println("obj1とobj2は同じインスタンスです。")
        println("End")
    }

    /**
     * Kotlinスタイル: object宣言を直接参照し、同一インスタンスであることを検証
     */
    @Test
    fun kotlinSingletonTest() {
        println("Start")
        val obj1 = KotlinSingleton
        val obj2 = KotlinSingleton

        assert(obj1 === obj2)
        println("obj1とobj2は同じインスタンスです。")
        println("End")
    }
}