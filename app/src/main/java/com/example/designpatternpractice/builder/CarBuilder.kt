package com.example.designpatternpractice.builder

interface CarBuilder {
    fun buildFront()
    fun buildSeat()
    fun buildRear()
    fun getResult(): String
}