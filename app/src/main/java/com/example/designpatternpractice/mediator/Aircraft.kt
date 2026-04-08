package com.example.designpatternpractice.mediator

// Colleague具象クラス: 旅客機・貨物機
// 離着陸時にATCへリクエストするだけで、他の機体の存在を知らない
// priority = 0（デフォルト）のため優先割り込みは発生しない
class Aircraft(
    override val name: String,
    override val control: ControlMediator,
    override val priority: Int = 0
) : FlyMobility {

    private var actionState = ""

    override fun prepareTakeOff() {
        println("[${this.name}] 離陸リクエスト")
        control.requestTakeOff(this)
        actionState = "離陸"
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
