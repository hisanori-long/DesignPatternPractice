package com.example.designpatternpractice.state

// State: 状態ごとの振る舞いを定義するインターフェース
interface MachineState {
    fun insertCoin(amount: Int): MachineState
    fun selectItem(item: DrinkItem): MachineState
    fun refund(): MachineState
}