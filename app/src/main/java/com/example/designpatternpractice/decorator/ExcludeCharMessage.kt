package com.example.designpatternpractice.decorator

// ConcreteDecorator: 指定した文字を含まないことを検証する
class ExcludeCharMessage(wrappedMessage: MessageInterface, val limitedChar: Char): MessageDecorator(wrappedMessage) {
    override fun validation(){
        super.validation()
        if ( content.any { it == limitedChar} ) throw ValidationException("Limited char ($limitedChar) is included")
        return
    }
}