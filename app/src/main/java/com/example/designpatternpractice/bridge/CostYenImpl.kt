package com.example.designpatternpractice.bridge

/** ConcreteImplementor: 円建てで合計金額を計算する */
class CostYenImpl: CostImpl {
    /** ドル単価を円換算してから数量を掛け、円建て合計金額を返す */
    override fun calcCost(unitDollarPrice: Int, amount: Int): Int {
        val unitYenPrice = exchangeDollarToYen(unitDollarPrice)
        return unitYenPrice * amount
    }

    /** 1ドル151円のレートでドルを円に換算する */
    private fun exchangeDollarToYen(dollarPrice: Int): Int {
        return dollarPrice * 151
    }
}