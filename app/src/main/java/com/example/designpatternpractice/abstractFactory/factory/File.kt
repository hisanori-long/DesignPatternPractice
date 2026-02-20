package com.example.designpatternpractice.abstractFactory.factory

import java.io.File

// AbstractProduct役: HTMLページ全体を表す抽象クラス
// Itemを受け取ってHTMLファイルとして出力する責務を持つ
abstract class Page(val title: String) {
    val itemList = mutableListOf<Item>()
    fun add(item: Item){
        itemList.add(item)
    }
    fun output(){
        try {
            val filename = "$title.html"
            val content = this.makeHtml()
            File(filename).writeText(content)
            println("create file successfully")
        } catch (err: Exception) {
            println(err.message.toString())
        }
    }
    abstract fun makeHtml(): String
}