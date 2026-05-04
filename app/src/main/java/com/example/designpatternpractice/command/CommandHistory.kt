package com.example.designpatternpractice.command

// [Command パターン] Invoker（起動者）
// Command の実行履歴をスタックで管理し、undo を提供する。
// 具体的な操作内容は知らず、TextCommand インターフェース経由でのみ命令を扱う。
class CommandHistory {
    private val commandHistory: MutableList<TextCommand> = mutableListOf()
    fun execute(command: TextCommand) {
        command.execute()
        commandHistory.add(command)
    }
    fun undo(){
        val command = commandHistory.removeLastOrNull()
        command?.undo()
    }
}