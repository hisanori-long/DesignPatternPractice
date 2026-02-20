package com.example.designpatternpractice.abstractFactory.factory

// AbstractProduct役: 複数のItemをまとめるリスト（Itemを継承しているため、入れ子構造が可能）
abstract class List(caption: String): Item(caption = caption) {
    val itemList = mutableListOf<Item>()
    fun add(item: Item){
        itemList.add(item)
    }
}