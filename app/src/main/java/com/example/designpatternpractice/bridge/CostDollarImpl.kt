package com.example.designpatternpractice.bridge

/** ConcreteImplementor: ドル建てで合計金額を計算する */
class CostDollarImpl: CostImpl {
    /** ドル単価 × 数量でドル建て合計金額を返す */
    override fun calcCost(unitDollarPrice: Int, amount: Int): Int {
        return unitDollarPrice * amount
    }
}