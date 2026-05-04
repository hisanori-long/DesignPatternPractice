package com.example.designpatternpractice.proxy

import java.nio.file.AccessDeniedException

// Proxy パターンの Proxy（代理）
// RealFileSystem の代理として振る舞い、操作前に権限チェックを行う Protection Proxy。
// クライアントは FileSystemInterface 経由でアクセスするため、
// 実際に RealFileSystem が呼ばれているか Proxy が介入しているかを意識しない。
class FileSystemProxy(private val permission: UserPermission): FileSystemInterface {
    private val realFileSystem = RealFileSystem()

    // 読み取りは権限を問わず RealFileSystem に委譲する
    override fun read() {
        realFileSystem.read()
    }

    // 書き込みは Editor 権限を持つ場合のみ RealFileSystem に委譲し、
    // ReadOnly の場合はアクセス拒否例外をスローする
    override fun write() {
        when (permission) {
            UserPermission.ReadOnly -> {
                throw AccessDeniedException("現在のアカウントでは書き込みできません")
            }
            UserPermission.Editor -> {
                realFileSystem.write()
            }
        }
    }
}