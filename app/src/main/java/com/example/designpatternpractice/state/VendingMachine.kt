package com.example.designpatternpractice.state

// Context: 現在の状態を保持し、操作を現在の状態に委譲する
class VendingMachine {
    var state: MachineState = IdleState

    fun insertCoin(amount: Int){
        try {
            state = state.insertCoin(amount)
        } catch (err: Exception){
            println(err)
        }
    }

    fun selectItem(item: DrinkItem){
        try {
            state = state.selectItem(item)
        } catch (err: Exception){
            println(err)
        }
    }

    fun refund(){
        try {
            state = state.refund()
        } catch (err: Exception){
            println(err)
        }
    }

    fun setOutOfOrder(){
        state = OutOfServiceState
    }
}


class DrinkItem(val name: String, val cost: Int)

class InsufficientFundsException(required: Int, actual: Int):
        IllegalStateException("[error] 残高不足 ${required}円必要ですが、${actual}円しかありません")