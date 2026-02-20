package com.example.designpatternpractice.abstractFactory.htmlList

import com.example.designpatternpractice.abstractFactory.factory.List

// ConcreteProduct役: HTML形式のリスト（<ul>タグ）を生成する
class ConcreteList(caption: String): List(caption = caption)  {
    override fun makeHtml(): String {
        val outputBuilder = StringBuilder()
        outputBuilder.append("<ul>")
        outputBuilder.append("<li>$caption</li>")
        itemList.forEach { item ->
            outputBuilder.append(item.makeHtml()
            )
        }
        outputBuilder.append("</ul>")
        return outputBuilder.toString()
    }
}