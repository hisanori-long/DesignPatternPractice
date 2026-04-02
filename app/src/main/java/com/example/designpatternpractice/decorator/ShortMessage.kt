package com.example.designpatternpractice.decorator

// ConcreteDecorator: 文字数が上限以内であることを検証する
class ShortMessage(wrappedMessage: MessageInterface, val lengthLimitation: Int): MessageDecorator(wrappedMessage) {
    override fun validation() {
        super.validation()
        if (content.length > this.lengthLimitation) throw ValidationException("message is too long ( > $lengthLimitation)")
        return
    }
}

