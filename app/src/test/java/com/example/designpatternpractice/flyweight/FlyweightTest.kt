package com.example.designpatternpractice.flyweight

import org.junit.Assert.assertSame
import org.junit.Assert.assertNotSame
import org.junit.Test

class FlyweightTest {

    @Test
    fun flyweightTest(){
        // Oak が3回、Cherry が2回登場するが、TreeType インスタンスは種ごとに1つだけ生成される
        val treeInfoList = listOf(
            "Oak"    to Position(10, 20),
            "Cherry" to Position(30, 40),
            "Pine"   to Position(50, 60),
            "Oak"    to Position(70, 80),
            "Cherry" to Position(90, 10),
            "Oak"    to Position(20, 30),
        )
        val forest = Forest(treeInfoList)
        forest.printForest()
    }
}
