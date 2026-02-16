package com.example.designpatternpractice.builder

class FRCar: CarBuilder {
    private val parts = mutableListOf<String>()

    /**
     * フロントにはエンジンを搭載
     */
    override fun buildFront() {
        parts.add(
            """
            |            ┌────────────┐
            |           ╱              ╲
            |          ╱ ┌────────────┐ ╲
            |         │  │  ⚡ENGINE⚡  │  │
            |         │  │  ◈◈◈◈◈◈◈◈  │  │
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
     * リアには駆動輪を搭載
     */
    override fun buildRear() {
        parts.add(
            """
            |         │  ┌────────────┐  │
            |         │  │  ⚙ DRIVE ⚙  │  │
            |         │  │  ◎◎◎◎◎◎◎◎  │  │
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