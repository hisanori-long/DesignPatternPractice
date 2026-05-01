package com.example.designpatternpractice.state

// ConcreteState: コイン投入済みの状態。商品の選択と返金を受け付ける
class HasMoneyState(): MachineState {
    private var hasMoneyAmount: Int = 0
    override fun insertCoin(amount: Int): MachineState {
        hasMoneyAmount += amount
        println("[Log] ${amount}円入りました")
        println("[Log] 現在は合計 ${hasMoneyAmount}円です")
        return this
    }

    override fun selectItem(item: DrinkItem): MachineState {
        println("[Log] ${item.name}が選ばれました")
        if (item.cost <= hasMoneyAmount){
            return this.refund()
        } else {
            throw InsufficientFundsException(required = item.cost, actual = hasMoneyAmount)
        }
    }

    override fun refund(): MachineState {
        println("[Log] ${hasMoneyAmount}円返金します")
        hasMoneyAmount = 0
        println("[Log] 現在は合計 ${hasMoneyAmount}円です")
        return IdleState
    }
}