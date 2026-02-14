package com.example.designpatternpractice.factory

import org.junit.Test

class FactoryTest {

    @Test
    fun factoryTest() {
        val archer: Npc = ArcherCreator().create()
        val swordMan: Npc = SwordManCreator().create()

        // 正しい型が生成されていること
        assert(archer is Archer)
        assert(swordMan is SwordMan)

        // 攻撃によりHPが減ること
        val hpBefore = swordMan.hp
        archer.attack(swordMan)
        assert(swordMan.hp < hpBefore)
    }
}