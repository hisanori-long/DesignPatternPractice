package com.example.designpatternpractice.singleton

/**
 * Singletonパターン（Javaスタイル）
 *
 * 目的: インスタンスが1つしか存在しないことを保証するパターン。
 * 用途: 設定管理、ログ出力、DB接続プールなど、共有リソースの一元管理に使われる。
 */
class Singleton private constructor() {
    companion object {
        // クラスロード時にインスタンスを生成（Eager初期化 = スレッドセーフ）
        private val singleton: Singleton = Singleton()

        fun getInstance(): Singleton {
            return singleton
        }
    }

    init {
        println("Singletonインスタンスを生成しました。")
    }
}