package com.example.designpatternpractice.chainOfResponsibility

// エラーコード 23（ドア状態エラー）を担当するハンドラ
class DoorStateError: ErrorHandler() {
    private val doorStateErrorNumber = 23
    override fun resolve(errorNumber: Int): Boolean {
        if (errorNumber == doorStateErrorNumber) {
            println("ドアの開閉状態を確認して下さい。")
            return true  // 処理完了
        } else {
            return false  // 担当外のエラーは次のハンドラへ
        }
    }
}
