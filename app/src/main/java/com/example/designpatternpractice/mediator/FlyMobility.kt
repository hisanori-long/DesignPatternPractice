package com.example.designpatternpractice.mediator

// Colleagueインターフェース
// controlをControlMediator（インターフェース）として持つことで、
// ColleagueはMediatorの具象クラスを知らない設計になっている
interface FlyMobility {
    val name: String
    val control: ControlMediator
    val priority: Int          // 優先度: 値が大きいほど待機キューの先頭に挿入される
    fun prepareTakeOff()
    fun prepareLanding()
    fun doAction()             // Mediatorから許可が下りたときに呼ばれる
}
