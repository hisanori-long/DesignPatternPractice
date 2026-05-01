package com.example.designpatternpractice.state

// ConcreteState: 故障中の状態。すべての操作を受け付けない
object OutOfServiceState: MachineState {
    override fun insertCoin(amount: Int): MachineState {
        throw UnsupportedOperationException("機械が故障しています")
    }

    override fun selectItem(item: DrinkItem): MachineState {
        throw UnsupportedOperationException("機械が故障しています")
    }

    override fun refund(): MachineState {
        throw UnsupportedOperationException("機械が故障しています")
    }
}