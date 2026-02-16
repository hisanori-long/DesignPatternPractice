package com.example.designpatternpractice.builder

/**
 * RR車 (リアエンジン・リア駆動)
 * エンジンが車体後部に配置される。ポルシェ911のようなスポーツカー。
 */
class RRCar: CarBuilder {
    private val parts = mutableListOf<String>()

    /**
     * フロントはトランク（エンジンがないため空きスペース）
     */
    override fun buildFront() {
        parts.add(
            """
            |            ┌────────────┐
            |           ╱              ╲
            |          ╱ ┌────────────┐ ╲
            |         │  │            │  │
            |         │  │  ▫ TRUNK ▫  │  │
            |         │  │            │  │
            |         │  └────────────┘  │
            """.trimMargin()
        )
    }

    /**
     * 4シート
     */
    override fun buildSeat() {
        parts.add(
            """
            |    ═════╡                  ╞═════
            |    ░░░░░│  ┌──┐    ┌──┐   │░░░░░
            |    ░░░░░│  │☻ │    │☻ │   │░░░░░
            |    ░░░░░│  └──┘    └──┘   │░░░░░
            |    ░░░░░│  ┌──┐    ┌──┐   │░░░░░
            |    ░░░░░│  │☻ │    │☻ │   │░░░░░
            |    ░░░░░│  └──┘    └──┘   │░░░░░
            |    ═════╡                  ╞═════
            """.trimMargin()
        )
    }

    /**
     * リアにはエンジン+駆動輪を搭載
     */
    override fun buildRear() {
        parts.add(
            """
            |         │  ┌────────────┐  │
            |         │  │⚡ENGINE+⚙  │  │
            |         │  │◈◈◈◈  ◎◎◎◎  │  │
            |         │  │⚡POWER  ⚙   │  │
            |          ╲ └────────────┘ ╱
            |           ╲              ╱
            |            └────────────┘
            """.trimMargin()
        )
    }

    override fun getResult(): String {
        return parts.joinToString("\n")
    }
}