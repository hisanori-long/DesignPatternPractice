package com.example.designpatternpractice.facade

// 【サブシステム】
// Facadeが内部で利用するクラス。
// internal修飾子により、同パッケージ外（クライアント）から直接呼び出せない。
class DVDPlayer {
    internal fun on() {
        println("DVDPlayerをONにしました")
    }

    internal fun off() {
        println("DVDPlayerをOFFにしました")
    }

    internal fun play(movie: String) {
        println("$movie を再生しました")
    }
}