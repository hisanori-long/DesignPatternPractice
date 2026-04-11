package com.example.designpatternpractice.observer

import org.junit.Test

class ObserverTest {

    @Test
    fun observerTest() {
        val doorState = VehicleDoorState()
        val carModel: VehicleObserver = CarModel()
        val doorOpenButton: VehicleObserver = DoorOpenButton()

        doorState.addObserver(carModel)
        doorState.addObserver(doorOpenButton)

        doorState.changeDoorState(true)
        doorState.changeDoorState(false)
    }
}