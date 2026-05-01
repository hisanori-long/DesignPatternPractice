package com.example.designpatternpractice.state

import org.junit.Test

class StateTest {

    @Test
    fun stateTest(){
        val vendingMachine = VendingMachine()
        val coke = DrinkItem(name = "coke", cost = 180)
        vendingMachine.selectItem(coke)
        vendingMachine.insertCoin(200)
        vendingMachine.selectItem(coke)
        vendingMachine.insertCoin(20)
        vendingMachine.refund()
        vendingMachine.setOutOfOrder()
        vendingMachine.insertCoin(100)
    }
}