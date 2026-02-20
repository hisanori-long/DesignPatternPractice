package com.example.designpatternpractice.abstractFactory.htmlList

import com.example.designpatternpractice.abstractFactory.factory.Item

// ConcreteProduct役: HTML形式の個別アイテム（<li>タグ）を生成する
class ConcreteItem(caption: String): Item(caption = caption) {
    override fun makeHtml(): String {
        return "<li>$caption</li>"
    }
}