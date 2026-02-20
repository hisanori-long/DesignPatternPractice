package com.example.designpatternpractice.abstractFactory.htmlList

import com.example.designpatternpractice.abstractFactory.factory.Page

// ConcreteProduct役: HTML形式のページ全体を生成する
class ConcretePage(title: String): Page(title = title){
    override fun makeHtml(): String {
        val outputBuilder = StringBuilder()
        outputBuilder.append(
            """
            <!DOCTYPE html>
            <html lang="ja">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>$title</title>
            </head>
            <body>
            """.trimIndent()
        )
        itemList.forEach { item ->
            outputBuilder.append(item.makeHtml())
        }
        outputBuilder.append("</body>")
        return outputBuilder.toString()
    }
}