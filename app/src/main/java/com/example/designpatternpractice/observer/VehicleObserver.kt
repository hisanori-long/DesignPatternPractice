package com.example.designpatternpractice.observer

// [Observer パターン] Observer（観察者）インターフェース
// Subject の状態変化を受け取る側のコントラクトを定義する。
// Subject から update() が呼ばれることで通知を受け取る（Pull型）。
// Pull型: Subject 自身を渡し、Observer 側が必要な情報を取りに行く方式。
// Push型と比べて Observer の柔軟性が高い一方、Subject への依存が生まれる。
interface VehicleObserver {
    fun update(subject: VehicleStateSubject)
}