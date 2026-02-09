package com.example.designpatternpractice.iterator

/**
 * 要素を順番に読んでいくインターフェイス
 */
interface Iterator {
    /**
     * indexの次の要素があるかを確認
     */
    fun hasNext(): Boolean

    /**
     * indexの次の要素を返す
     */
    fun next(): Any
}
