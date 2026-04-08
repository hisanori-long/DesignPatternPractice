package com.example.designpatternpractice.mediator

// Mediator具象クラス: 管制塔
// 飛行体同士は直接通信せず、すべてATCを経由して滑走路を調整する
// → Colleague間の依存をゼロにし、調整ロジックをここに集約する
class AirTrafficControl: ControlMediator {
    private val waitingList: MutableList<FlyMobility> = mutableListOf()

    // priorityが高い機体ほど先頭に挿入する（優先順位付き待機キュー）
    override fun requestTakeOff(mobility: FlyMobility) {
        val insertIndex = waitingList.indexOfFirst { it.priority < mobility.priority }
        if (insertIndex == -1) {
            waitingList.addLast(mobility)
        } else {
            waitingList.add(insertIndex, mobility)
        }
        val label = if (mobility.priority > 0) "優先待機" else "待機"
        println("[ATC] ${mobility.name}: 離陸$label")
    }

    // 着陸はキューの末尾に追加（優先割り込みなし）
    override fun requestLanding(mobility: FlyMobility) {
        waitingList.addLast(mobility)
        println("[ATC] ${mobility.name}: 着陸待機")
    }

    // キューの先頭の機体にアクション許可を与える
    // NOTE: waitingListが空の状態で呼ぶと NoSuchElementException がスローされる
    override fun checkRunwayVacant() {
        println("[ATC] 滑走路の安全を確認")
        val mobility = waitingList.removeFirst()
        println("[ATC] ${mobility.name}: アクション許可")
        mobility.doAction()
    }
}
