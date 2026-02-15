package com.example.designpatternpractice.prototype

/**
 * Prototypeパターン: インスタンスのコピーによってオブジェクトを生成するパターン
 *
 * Prototypeインターフェース
 * - Cloneableを継承し、clone()を利用可能にする
 * - 具象クラスに依存せず、このインターフェースを通じてコピーを生成できる
 */
interface Prototype: Cloneable {
    fun createClone(): Prototype?
    fun printSign()
}
