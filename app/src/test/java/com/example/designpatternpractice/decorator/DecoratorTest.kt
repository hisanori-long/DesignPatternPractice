package com.example.designpatternpractice.decorator

import org.junit.Test

class DecoratorTest {

    @Test
    fun decoratorTest() {

        var message: MessageInterface = Message("this is a pen.")

        message = LowercaseMessage(message)
        message = ShortMessage(message, 15)
        message = ExcludeCharMessage(message, 'k')

        message.validation()
        message.showMessage()
    }
}