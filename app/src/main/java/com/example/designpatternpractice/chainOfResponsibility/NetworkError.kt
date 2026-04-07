package com.example.designpatternpractice.chainOfResponsibility

// エラーコード 400〜499（HTTPクライアントエラー）を担当するハンドラ
class NetworkError: ErrorHandler() {
    override fun resolve(errorNumber: Int): Boolean {
        if (errorNumber in 400..<500) {
            println("Network Error")
            return true  // 処理完了
        } else {
            return false  // 担当外のエラーは次のハンドラへ
        }
    }
}