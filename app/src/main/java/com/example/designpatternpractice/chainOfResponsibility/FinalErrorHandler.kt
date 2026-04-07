package com.example.designpatternpractice.chainOfResponsibility

// チェーンの末端ハンドラ。どのハンドラも処理できなかった場合に例外をスローする
// 「未処理のエラーを黙って無視しない」という設計上の安全策
class FinalErrorHandler: ErrorHandler() {
    override fun resolve(errorNumber: Int): Boolean {
        throw NotFoundErrorHandlerException()
    }
}

class NotFoundErrorHandlerException: RuntimeException("not find error handler")