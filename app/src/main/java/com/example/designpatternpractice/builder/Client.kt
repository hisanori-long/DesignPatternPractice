package com.example.designpatternpractice.builder

class Client {
    fun createCars() {
        // === フル装備の車を3種類作成 ===
        println("===== FR車（フロントエンジン・リア駆動）=====")
        val frBuilder = FRCar()
        Director(frBuilder).constructFullCar()
        println(frBuilder.getResult())

        println()
        println("===== MR車（ミッドシップエンジン・リア駆動）=====")
        val mrBuilder = MRCar()
        Director(mrBuilder).constructFullCar()
        println(mrBuilder.getResult())

        println()
        println("===== RR車（リアエンジン・リア駆動）=====")
        val rrBuilder = RRCar()
        Director(rrBuilder).constructFullCar()
        println(rrBuilder.getResult())

        // === 同じDirectorでも構成パターンを変えられる ===
        println()
        println("===== FR車 プロトタイプ（駆動系なし）=====")
        val protoBuilder = FRCar()
        Director(protoBuilder).constructPrototype()
        println(protoBuilder.getResult())

        println()
        println("===== MR車 フレームのみ（シートなし）=====")
        val frameBuilder = MRCar()
        Director(frameBuilder).constructFrameOnly()
        println(frameBuilder.getResult())
    }
}
