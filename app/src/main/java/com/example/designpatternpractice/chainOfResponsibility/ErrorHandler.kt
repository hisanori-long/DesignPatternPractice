package com.example.designpatternpractice.chainOfResponsibility

// Chain of Responsibility パターンの抽象ハンドラ
// 各ハンドラは「自分が処理できるか試みる → できなければ次に委譲」という責務を持つ
abstract class ErrorHandler {
    // 次のハンドラへの参照。null の場合はチェーンの末端
    private var next: ErrorHandler? = null

    // サブクラスがオーバーライドして処理の可否を返す
    // true: 処理完了 / false: 次のハンドラへ委譲
    protected abstract fun resolve(errorNumber: Int): Boolean

    // チェーンを構築するメソッド。
    // 引数（次のハンドラ）を返すことでメソッドチェーンによる連結が可能になる
    // 例: a.setNext(b).setNext(c) → a → b → c
    // ※ this を返すと常に先頭ハンドラが返り、2番目以降の setNext が先頭の next を上書きしてしまうため注意
    fun setNext(errorHandler: ErrorHandler): ErrorHandler{
        next = errorHandler
        return errorHandler
    }

    // エラー処理のエントリポイント。チェーンの先頭ハンドラに対して呼び出す
    fun handleError(errorNumber: Int){
        if (resolve(errorNumber)){
            println("Error resolved")
        } else next?.handleError(errorNumber)  // 処理できなければ次のハンドラへ委譲
    }
}