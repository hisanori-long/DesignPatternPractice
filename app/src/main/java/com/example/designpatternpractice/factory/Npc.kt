package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの Product（製品）に相当する抽象クラス
 * 具体的なNPCの共通インターフェースを定義する
 */
abstract class Npc {
    abstract var hp: Int
    abstract val name: String
    abstract fun talk()
    abstract fun attack(targetNpc: Npc)
    fun printMessage(message: String) {
        println("[${this.name}] $message")
    }
}