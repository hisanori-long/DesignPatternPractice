package com.example.designpatternpractice.mediator

import org.junit.Test

class MediatorTest {

    @Test
    fun mediatorTest() {
        val atc = AirTrafficControl()
        val aircraftA = Aircraft("ANA001", atc)
        val aircraftB = Aircraft("JAL002", atc)
        val militaryA = MilitaryAirCraft("JP0231", atc)

        aircraftA.prepareLanding()
        atc.checkRunwayVacant()
        aircraftB.prepareTakeOff()
        militaryA.prepareTakeOff()
        atc.checkRunwayVacant()
        atc.checkRunwayVacant()
    }
}
