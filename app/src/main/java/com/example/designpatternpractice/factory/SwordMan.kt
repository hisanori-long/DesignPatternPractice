package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの ConcreteProduct（具体的な製品）に相当するクラス
 * 剣士タイプのNPCを表し、高いHPと攻撃力を持つ
 */
class SwordMan(name: String?) : Npc() {
    override var hp = 30
    override val name = name ?: "剣士"
    val attackPoint = 3
    override fun talk() {
        printMessage("私は剣士です。")
        printMessage("体力が${this.hp}もあります")
    }

    override fun attack(targetNpc: Npc) {
        targetNpc.hp -= attackPoint
        printMessage("${targetNpc.name}に $attackPoint の攻撃")
    }
}