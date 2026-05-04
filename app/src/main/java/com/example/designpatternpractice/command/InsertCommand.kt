package com.example.designpatternpractice.command

// [Command パターン] ConcreteCommand（具体命令）- テキスト挿入
// execute() で挿入前のテキストを保持し、undo() で復元することで
// Invoker に履歴管理を委ねた可逆操作を実現する。
class InsertCommand(
    private val textEditor: TextEditor,
    private val insertIndex: Int, // _文字目に文字を入れるか
    private val insertText: String,
): TextCommand {
    private lateinit var previousText: String
    override fun execute() {
        previousText = textEditor.text
        val sb = StringBuilder(textEditor.text)
        textEditor.text = sb.insert(insertIndex, insertText).toString()
    }

    override fun undo() {
        textEditor.text = previousText
    }
}