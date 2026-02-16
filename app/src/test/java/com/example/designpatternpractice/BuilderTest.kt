package com.example.designpatternpractice

import com.example.designpatternpractice.builder.Client
import org.junit.Test

class BuilderTest {
    @Test
    fun builderTest(){
        Client().createCars()
    }
}