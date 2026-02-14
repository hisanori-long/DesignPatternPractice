package com.example.designpatternpractice.template

class Pasta : CookingDinner() {
    override fun prepare() {
        println("パスタの麺を用意する")
        println("にんにく、ベーコン、鷹の爪を用意する")
        println("卵とパルメザンチーズを混ぜてソースを作る")
        println("大きな鍋にお湯を沸かして塩を入れる")
    }

    override fun cut() {
        println("にんにくをみじん切りにする")
        println("ベーコンを短冊切りにする")
        println("鷹の爪を輪切りにする")
    }

    override fun heat() {
        println("パスタを茹でる")
        println("フライパンでオリーブオイルとにんにくを弱火で炒める")
        println("ベーコンと鷹の爪を加えて炒める")
        println("茹で上がったパスタを加えて和える")
        println("火を止めて卵ソースを絡める")
    }
}