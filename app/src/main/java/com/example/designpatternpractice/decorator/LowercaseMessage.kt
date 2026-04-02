package com.example.designpatternpractice.decorator

// ConcreteDecorator: 大文字を含まないことを検証する
class LowercaseMessage(wrappedMessage: MessageInterface): MessageDecorator(wrappedMessage) {
    override fun validation(){
        super.validation()
        if ( content.any { it.isUpperCase()} ) throw ValidationException("include uppercase letter")
        return
    }
}