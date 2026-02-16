package com.example.designpatternpractice.builder

/**
 * MR車 (ミッドシップエンジン・リア駆動)
 * エンジンが車体中央に配置される。フェラーリやランボルギーニのようなスーパーカー。
 */
class MRCar: CarBuilder {
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
     * 2シート + ミッドシップエンジン
     */
    override fun buildSeat() {
        parts.add(
            """
            |    ═════╡                  ╞═════
            |    ░░░░░│  ┌──┐  ╔═════╗  │░░░░░
            |    ░░░░░│  │☻ │  ║ ⚡⚡ ║  │░░░░░
            |    ░░░░░│  └──┘  ║  EN ║  │░░░░░
            |    ░░░░░│  ┌──┐  ║GINE ║  │░░░░░
            |    ░░░░░│  │☻ │  ║ ⚡⚡ ║  │░░░░░
            |    ░░░░░│  └──┘  ╚═════╝  │░░░░░
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