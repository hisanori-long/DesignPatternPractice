package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの ConcreteCreator（具体的な工場）に相当するクラス
 * Archerインスタンスの生成を担当する
 */
class ArcherCreator: NpcCreator() {
    override fun createInstance(name: String?): Archer {
        return Archer(name = name)
    }
}