package com.example.designpatternpractice.memento


// [Caretaker]
// Mementoの履歴をスタックとして管理し、undo操作を提供する。
// MementoリストとOriginatorはprivateにしてカプセル化を守る。
// Mementoの中身（text）には直接アクセスせず、Originatorに復元を委ねる。
class TextEditor {
    private val mementoList : MutableList<TextOriginator.TextMemento> = mutableListOf()
    private val textOriginator = TextOriginator()

    fun addText(str: String){
        println("「$str」を追加します")
        textOriginator.addText(str)
        // 操作後の状態をスナップショットとして末尾に追加
        mementoList.add(textOriginator.createMemento())
    }

    fun deleteText(length: Int){
        println("$length 文字削除します")
        textOriginator.deleteText(length)
        mementoList.add(textOriginator.createMemento())
    }

    fun undoText(){
        // 履歴が1件以下 = 戻る先がない
        if (mementoList.size <= 1) println("undoできません")
        else {
            println("1つ前に戻ります")
            mementoList.removeLast()              // 現在の状態を捨てる
            textOriginator.restoreMemento(mementoList.last()) // 1つ前の状態に戻す
        }
    }

    fun printText(){
        println("現在のテキストは：${textOriginator.getText()}")
    }
}