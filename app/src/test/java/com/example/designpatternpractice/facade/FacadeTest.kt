package com.example.designpatternpractice.facade

import org.junit.Test

class FacadeTest {

    @Test
    fun facadeTest() {
        val homeTheaterFacade = HomeTheaterFacade(Amplifier(), DVDPlayer(), Projector())
        homeTheaterFacade.playMovie("Run", 15)
        homeTheaterFacade.endMovie()
    }
}