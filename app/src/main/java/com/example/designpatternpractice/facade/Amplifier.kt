package com.example.designpatternpractice.facade

// 【サブシステム】
// Facadeが内部で利用するクラス。
// internal修飾子により、同パッケージ外（クライアント）から直接呼び出せない。
class Amplifier {
    internal fun on() {
        println("アンプをONにしました")
    }

    internal fun off() {
        println("アンプをOFFにしました")
    }

    internal fun setVolume(level: Int){
        println("アンプのボリュームを$level にしました")
    }
}