package com.example.designpatternpractice.abstractFactory.factory

// AbstractProduct役: 個々のHTML要素を表す抽象クラス
// 具象クラス（ConcreteItem, ConcreteList）がHTML生成の詳細を実装する
abstract class Item(val caption: String) {
    abstract fun makeHtml(): String
}