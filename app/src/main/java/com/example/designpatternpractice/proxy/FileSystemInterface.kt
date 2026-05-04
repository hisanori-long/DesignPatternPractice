package com.example.designpatternpractice.proxy

// Proxy パターンの Subject（主体インターフェース）
// RealSubject（RealFileSystem）と Proxy（FileSystemProxy）が共通して実装するインターフェース。
// クライアントはこのインターフェース経由で操作するため、Proxy の存在を意識しない。
interface FileSystemInterface {
    fun read()
    fun write()
}

// ユーザーの操作権限を表す列挙型
// ReadOnly: 読み取りのみ許可 / Editor: 読み書きを許可
enum class UserPermission {
    ReadOnly,
    Editor
}
