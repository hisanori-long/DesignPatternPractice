package com.example.designpatternpractice.proxy

// Proxy パターンの RealSubject（実主体）
// 実際のファイルシステム操作を担うクラス。
// クライアントからは直接呼ばれず、FileSystemProxy 経由でアクセスされる。
class RealFileSystem: FileSystemInterface {
    override fun read() {
        println("[FileSystem] ファイルを読み込みました")
    }

    override fun write() {
        println("[FileSystem] ファイルに書き込みました")
    }
}