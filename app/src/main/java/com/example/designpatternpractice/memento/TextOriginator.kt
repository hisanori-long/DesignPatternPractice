package com.example.designpatternpractice.memento

// [Originator]
// 管理対象の状態（text）を持ち、MementoへのスナップショットI/Oを担当する。
class TextOriginator {
    private var text = ""

    // [Memento]
    // Originatorの内側にネストクラスとして定義することで、
    // textプロパティをinternal（モジュール外から不可視）にしつつ
    // Originator自身は読み書きできるようにしている。
    // Caretaker（TextEditor）はこのクラスを保持するだけで中身を参照しない。
    class TextMemento(internal val text: String)

    fun addText(str: String){
        text += str
    }

    fun deleteText(length: Int) {
        if (text.length <= length) text = ""
        else text = text.removeRange(text.length- length, text.length)
    }

    fun getText():String {return text}

    fun createMemento(): TextMemento{
        return TextMemento(text)
    }

    fun restoreMemento(memento: TextMemento){
        text = memento.text
    }
}