package com.example.designpatternpractice.command

// [Command パターン] Command（命令）インターフェース
// 全ての命令操作を execute() / undo() として抽象化する。
// Invoker はこのインターフェースのみに依存するため、
// 命令の種類が増えても Invoker を変更せずに済む。
interface TextCommand {
    fun execute()
    fun undo()
}