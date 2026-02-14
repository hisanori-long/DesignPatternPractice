package com.example.designpatternpractice.factory

/**
 * Factory Methodパターンの Creator（工場）に相当する抽象クラス
 * - create(): インスタンス生成の共通処理を定義するTemplate Method
 * - createInstance(): サブクラスが具体的な生成処理を実装するFactory Method
 */
abstract class NpcCreator {
    fun create(name: String? = null): Npc{
        val npc = this.createInstance(name = name)
        println("${npc.name}が出現しました")
        return npc
    }
    protected abstract fun createInstance(name: String?): Npc
}