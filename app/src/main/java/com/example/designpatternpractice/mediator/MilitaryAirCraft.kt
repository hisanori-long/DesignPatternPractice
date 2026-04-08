package com.example.designpatternpractice.mediator

// Colleague具象クラス: 軍用機
// priority = 10（デフォルト）により、一般機より先にキューの先頭へ割り込む
// それ以外の構造はAircraftと同じ → 共通部分を抽象クラスに切り出す余地がある
class MilitaryAirCraft(
    override val name: String,
    override val control: ControlMediator,
    override val priority: Int = 10
) : FlyMobility {
    private var actionState = ""

    override fun prepareTakeOff() {
        println("[${this.name}] 緊急離陸リクエスト")
        control.requestTakeOff(this)
        actionState = "緊急離陸"
    }

    override fun prepareLanding() {
        println("[${this.name}] 着陸リクエスト")
        control.requestLanding(this)
        actionState = "着陸"
    }

    override fun doAction() {
        println("[${this.name}] $actionState を実行")
    }
}
