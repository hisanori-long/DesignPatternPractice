package com.example.designpatternpractice.decorator

// Decorator: ラップしたコンポーネントへ処理を委譲する抽象デコレータ基底クラス
abstract class MessageDecorator(wrappedMessage: MessageInterface): MessageInterface by wrappedMessage