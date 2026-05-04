package com.example.designpatternpractice.command

// [Command パターン] ConcreteCommand（具体命令）- テキスト削除
// execute() で削除前のテキストを保持し、undo() で復元することで
// Invoker に履歴管理を委ねた可逆操作を実現する。
class DeleteCommand(
    private val textEditor: TextEditor,
    private val deleteStartIndex: Int,
    private val deleteEndIndex: Int,
): TextCommand {
    private lateinit var previousText: String
    override fun execute() {
        previousText = textEditor.text
        textEditor.text = textEditor.text.removeRange(deleteStartIndex, deleteEndIndex)
    }

    override fun undo() {
        textEditor.text = previousText
    }
}