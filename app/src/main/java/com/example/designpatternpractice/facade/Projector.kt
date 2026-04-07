package com.example.designpatternpractice.facade

// 【サブシステム】
// Facadeが内部で利用するクラス。
// internal修飾子により、同パッケージ外（クライアント）から直接呼び出せない。
class Projector {
    internal fun on() {
        println("プロジェクターをONにしました")
    }

    internal fun off() {
        println("プロジェクターをOFFにしました")
    }
}