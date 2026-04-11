package com.example.designpatternpractice.observer

// [Observer パターン] Subject（通知元）の抽象クラス
// Observer の登録・削除・通知という共通の仕組みをここに集約する。
// 具体的な状態は getState() をサブクラスに委ねることで、
// Subject の種類が増えても通知ロジックを変更せずに済む。
abstract class VehicleStateSubject {
    // private にすることで、外部から直接リストを操作させない。
    // add/remove メソッド経由でのみ管理する。
    // MutableSet を使うことで同一 Observer の重複登録を防ぐ。
    private val observers: MutableSet<VehicleObserver> = mutableSetOf()

    fun addObserver(observer: VehicleObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: VehicleObserver) {
        observers.remove(observer)
    }

    // 登録済みのすべての Observer に状態変化を通知する。
    // Subject 自身（this）を渡すことで Observer が状態を Pull できる。
    fun notifyObservers() {
        observers.forEach { observer ->  observer.update(this) }
    }

    // 具体的な状態はサブクラスで定義する。
    abstract fun getState(): Boolean
}