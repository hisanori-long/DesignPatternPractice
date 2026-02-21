package com.example.designpatternpractice.bridge

import org.junit.Assert.assertEquals
import org.junit.Test

class BridgeTest {

    @Test
    fun BridgeTest(){
        val costDollar = Cost(CostDollarImpl())
        val costYen = Cost(CostYenImpl())
        val costDollarWithTax = CostWithTax(CostDollarImpl())
        val costYenWithTax = CostWithTax(CostYenImpl())

        val unitDollarPrice = 231
        val amount = 12
        val taxRate = 1.05f

        // ドル建て: 231 * 12 = 2772
        assertEquals(2772, costDollar.calcCost(unitDollarPrice, amount))

        // 円建て: (231 * 151) * 12 = 418572
        assertEquals(418572, costYen.calcCost(unitDollarPrice, amount))

        // ドル建て税込み: (2772 * 1.05).toInt() = 2910
        assertEquals(2910, costDollarWithTax.calcCostWithTax(unitDollarPrice, amount, taxRate))

        // 円建て税込み: (418572 * 1.05).toInt() = 439500
        assertEquals(439500, costYenWithTax.calcCostWithTax(unitDollarPrice, amount, taxRate))
    }
}