package com.example.designpatternpractice.command

import org.junit.Test

class CommandTest {
    @Test
    fun insertText() {
        val editor = TextEditor()
        val history = CommandHistory()
        val cmdA= InsertCommand(editor, 0, "Hello")
        history.execute(cmdA)
        editor.print()

        val cmdB = InsertCommand(editor, 5, "World")
        history.execute(cmdB)
        editor.print()

        history.undo()
        editor.print()

        val cmdC = DeleteCommand(editor, 0,4)
        history.execute(cmdC)
        editor.print()
    }
}
