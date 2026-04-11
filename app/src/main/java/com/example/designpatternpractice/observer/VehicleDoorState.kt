package com.example.designpatternpractice.observer

// [Observer パターン] ConcreteSubject（具体的な通知元）
// 監視対象となる状態（ドアの開閉）を保持する。
// 状態が変わったタイミングで notifyObservers() を呼ぶことが責務。
// Observer の存在を知らず、通知するだけでよい（疎結合）。
class VehicleDoorState: VehicleStateSubject() {
    var isDoorOpen = false

    override fun getState(): Boolean {
        return this.isDoorOpen
    }

    fun changeDoorState(isDoorOpen: Boolean){
        this.isDoorOpen = isDoorOpen
        println("ドア状態を変更しました：isDoorOpen=${this.isDoorOpen}")
        // 状態変更後、登録済み Observer に一括通知する。
        this.notifyObservers()
    }
}