package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの ConcreteCreator（具体的な工場）に相当するクラス
 * SwordManインスタンスの生成を担当する
 */
class SwordManCreator: NpcCreator() {
    override fun createInstance(name: String?): SwordMan {
        return SwordMan(name)
    }
}