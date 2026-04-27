package com.example.designpatternpractice.memento

import org.junit.Test

class MementoTest {

    @Test
    fun mementTest(){
        val textEditor = TextEditor()

        textEditor.addText("dfhaweui")
        textEditor.addText("fewahfaesea")
        textEditor.printText()
        textEditor.undoText()
        textEditor.printText()
        textEditor.deleteText(3)
        textEditor.printText()
        textEditor.undoText()
        textEditor.printText()
    }
}