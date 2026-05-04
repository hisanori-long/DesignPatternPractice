package com.example.designpatternpractice.command

// [Command パターン] Receiver（受信者）
// 実際の操作対象であるテキストの状態を保持する。
// Command はこのクラスを通じて挿入・削除などの操作を実行する。
class TextEditor {
    var text = ""

    fun print(){
        println("現在のテキストは${this.text}")
    }
}