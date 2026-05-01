package com.example.designpatternpractice.state

// ConcreteState: 待機中の状態。コインの投入のみ受け付ける
object IdleState: MachineState {
    override fun insertCoin(amount: Int): MachineState {
        return HasMoneyState().apply { insertCoin(amount) }

    }

    override fun selectItem(item: DrinkItem): MachineState {
        throw UnsupportedOperationException("[Log] お金を入れてください")

    }

    override fun refund(): MachineState {
        throw UnsupportedOperationException("[Log] 返金するお金がありません")
    }
}