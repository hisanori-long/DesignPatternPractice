package com.example.designpatternpractice.bridge

/** Abstraction: 価格計算の抽象クラス。CostImpl に計算処理を委譲する */
open class Cost(val impl: CostImpl) {
    /** 実装クラスに処理を委譲して合計金額を計算する */
    fun calcCost(unitDollarPrice: Int, amount: Int): Int {
        return impl.calcCost(unitDollarPrice = unitDollarPrice, amount = amount)
    }
}