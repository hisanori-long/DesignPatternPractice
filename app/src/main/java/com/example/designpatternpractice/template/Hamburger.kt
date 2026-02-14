package com.example.designpatternpractice.template

class Hamburger: CookingDinner() {
    override fun prepare() {
        println("お肉を解凍する")
        println("バンズを用意")
        println("トマト、玉ねぎ、レタスを洗う")
        println("お肉をこねる")
    }

    override fun cut() {
        println("トマト、玉ねぎ、レタスを切る")
        println("バンズは真ん中で半分に切る")
    }

    override fun heat() {
        println("鉄板でお肉を強火で炒める")
        println("バターを使って鉄板でバンズを温める")
    }

    override fun serving() {
        println("バンズ、お肉、トマト、玉ねぎ、レタスを合体する")
        super.serving()
    }
}