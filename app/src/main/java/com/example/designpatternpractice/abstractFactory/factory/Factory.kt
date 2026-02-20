package com.example.designpatternpractice.abstractFactory.factory

// AbstractFactory役: 抽象的な製品（Item, List, Page）を生成するためのインターフェースを定義する
// 具体的な製品クラスには依存せず、生成メソッドの戻り値は全て抽象型になっている
abstract class Factory {
    abstract fun createItem(caption: String): Item
    abstract fun createList(caption: String): List
    abstract fun createFile(title: String): Page
}