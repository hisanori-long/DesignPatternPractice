package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの ConcreteProduct（具体的な製品）に相当するクラス
 * 弓使いタイプのNPCを表し、2回攻撃の特性を持つ
 */
class Archer(name: String?) : Npc() {
    override var hp = 20
    override val name = name?: "弓使い"
    override fun talk() {
        printMessage("私は弓を使います。")
        printMessage("２回攻撃ができることが特長です。")
    }

    val attackPoint = 2
    override fun attack(targetNpc: Npc) {
        targetNpc.hp -= attackPoint
        printMessage("${targetNpc.name}に $attackPoint の攻撃")
        targetNpc.hp -= attackPoint
        printMessage("${targetNpc.name}に $attackPoint の攻撃")
    }
}