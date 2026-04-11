package com.example.designpatternpractice.observer

// [Observer パターン] ConcreteObserver（具体的な観察者）その１
// 車の 3D モデルの表示を担当する Observer。
// Subject から通知を受け取り、getState() で状態を Pull して自身の表示を更新する。
// VehicleStateSubject を直接知っている点が Pull 型の特徴。
class CarModel: VehicleObserver {
    override fun update(subject: VehicleStateSubject) {
        if (subject.getState()) {
            println("車の３Dモデルのドアを開ける")
        } else {
            println("車の３Dモデルのドアを閉じる")
        }
    }
}