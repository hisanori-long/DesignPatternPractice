package com.example.designpatternpractice.template

class Curry : CookingDinner() {
    override fun prepare() {
        println("お肉を解凍する")
        println("じゃがいも、にんじん、玉ねぎを洗う")
        println("カレールーを用意する")
        println("お米を研いで炊飯器にセットする")
    }

    override fun cut() {
        println("じゃがいもを一口サイズに切る")
        println("にんじんを乱切りにする")
        println("玉ねぎをくし切りにする")
        println("お肉を一口サイズに切る")
    }

    override fun heat() {
        println("鍋で油を熱してお肉を炒める")
        println("野菜を加えて炒める")
        println("水を加えて煮込む")
        println("カレールーを入れてとろみがつくまで煮込む")
    }

    override fun serving() {
        println("お皿にご飯を盛る")
        println("カレーをご飯の横にかける")
    }
}