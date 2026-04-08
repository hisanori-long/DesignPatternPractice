package com.example.designpatternpractice.mediator

// Mediatorインターフェース
// ColleagueはこのインターフェースのみをKnowするため、具象Mediatorへの依存がなくなる
// → テスト時にモックに差し替え可能になる
interface ControlMediator {
    fun requestTakeOff(mobility: FlyMobility)
    fun requestLanding(mobility: FlyMobility)
    fun checkRunwayVacant()
}