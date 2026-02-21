package com.example.designpatternpractice.bridge

/** Implementor: 通貨ごとの価格計算方法を定義するインターフェース */
interface CostImpl {
    /** ドル単価と数量から合計金額を計算する */
    fun calcCost(unitDollarPrice: Int, amount: Int): Int
}