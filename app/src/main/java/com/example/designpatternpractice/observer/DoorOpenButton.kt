package com.example.designpatternpractice.observer

// [Observer パターン] ConcreteObserver（具体的な観察者）その２
// ドアを開けるボタンの活性状態を担当する Observer。
// ドアが開いているときはボタンを disable にすることで二重操作を防ぐ。
// CarModel と同じ Subject を監視しているが、それぞれ独立して動作する点が Observer パターンの強み。
class DoorOpenButton: VehicleObserver {
    override fun update(subject: VehicleStateSubject) {
        if (subject.getState()) {
            println("ドアを開けるボタンをdisableにする")
        } else {
            println("ドアを開けるボタンをenableにする")
        }
    }
}