package com.example.designpatternpractice.abstractFactory.htmlList

import com.example.designpatternpractice.abstractFactory.factory.Factory
import com.example.designpatternpractice.abstractFactory.factory.Page
import com.example.designpatternpractice.abstractFactory.factory.Item
import com.example.designpatternpractice.abstractFactory.factory.List

// ConcreteFactory役: HTML形式の具象製品群（ConcreteItem, ConcreteList, ConcretePage）を生成する
// 別の形式（例: Markdown）が必要になった場合、このクラスと同様に新しいConcreteFactoryを追加するだけで対応できる
class ConcreteFactory(): Factory() {
    override fun createItem(caption: String): Item {
        return ConcreteItem(caption)
    }

    override fun createList(caption: String): List {
        return ConcreteList(caption)
    }

    override fun createFile(title: String): Page {
        return ConcretePage(title)
    }
}