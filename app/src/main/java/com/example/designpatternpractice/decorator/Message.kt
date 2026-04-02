package com.example.designpatternpractice.decorator

// Component: デコレータと具体的なコンポーネントが共通して実装するインターフェース
interface MessageInterface {
    val content: String
    fun validation()
    fun showMessage() = println(this.content)
}

// ConcreteComponent: デコレータで機能を付加される基底となるクラス
class Message(override val content: String): MessageInterface {
    override fun validation(){}

}
