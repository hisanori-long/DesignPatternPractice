package com.example.designpatternpractice.iterator

/**
 * Iteratorによって数えられるオブジェクト
 * 自らのIteratorを作成する機能を持つ
 */
interface Collection {
    /** iteratorオブジェクトを生成する */
    fun iterator(): Iterator
}