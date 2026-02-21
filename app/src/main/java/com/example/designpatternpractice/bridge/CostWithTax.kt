package com.example.designpatternpractice.bridge

/** RefinedAbstraction: 税込み価格計算を追加した拡張クラス */
class CostWithTax(impl: CostImpl) : Cost(impl) {
    /** 合計金額に税率を乗じた税込み金額を返す */
    fun calcCostWithTax(unitDollarPrice: Int, amount: Int, taxRate: Float): Int {
        return (calcCost(unitDollarPrice, amount) * taxRate).toInt()
    }
}