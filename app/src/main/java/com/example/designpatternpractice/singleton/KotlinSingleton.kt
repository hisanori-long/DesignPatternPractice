package com.example.designpatternpractice.singleton

/**
 * Singletonパターン（Kotlinスタイル）
 *
 * object 宣言により、言語レベルでSingletonが保証される。
 * - インスタンスは1つだけ生成される
 * - スレッドセーフ
 * - private constructorやgetInstance()を書く必要がない
 *
 * Javaスタイル（→ Singleton.kt）と比較すると、ボイラープレートが不要で簡潔。
 */
object KotlinSingleton {
    init {
        println("Kotlinではobjectを使ってSingletonを使用するのが一般的です。")
    }
}