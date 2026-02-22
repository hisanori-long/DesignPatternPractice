package com.example.designpatternpractice.strategy

import org.junit.Test

class StrategyTest {
    @Test
    fun fullyRandomStrategyTest(){
        println("FullyRandomStrategy")
        testBasic(FullyRandomStrategy(), FullyRandomStrategy())
    }

    @Test
    fun countFrequentNumberStrategy(){
        println("CountFrequentNumberStrategy")
        testBasic(CountFrequentNumberStrategy(), CountFrequentNumberStrategy())
    }

    fun testBasic(player1Strategy: Strategy, player2Strategy: Strategy){
        val player1 = Player(strategy = player1Strategy)
        val player2 = Player(strategy = player2Strategy)

        for (i in 0 until 10000){
            player1.setAnswer()
            player2.guess()

            player2.setAnswer()
            player1.guess()
        }

        println("[Result] player1 win:${player1.winCount}, lose:${player1.loseCount}")
        println("[Result] player2 win:${player2.winCount}, lose:${player2.loseCount}")
    }
}