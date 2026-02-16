package com.example.designpatternpractice.builder

class Director(private val carBuilder: CarBuilder) {

    /** フル装備の標準車 */
    fun constructFullCar() {
        carBuilder.buildFront()
        carBuilder.buildSeat()
        carBuilder.buildRear()
    }

    /** シートなしのフレームだけ（展示用シャシー） */
    fun constructFrameOnly() {
        carBuilder.buildFront()
        carBuilder.buildRear()
    }

    /** フロントとシートだけ（駆動系なし、開発中プロトタイプ） */
    fun constructPrototype() {
        carBuilder.buildFront()
        carBuilder.buildSeat()
    }
}