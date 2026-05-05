package com.example.designpatternpractice.interpreter

// Interpreter パターンの TerminalExpression（終端記号）― 変数
// Context に問い合わせて値を取得するため、同じ式ツリーでも Context の内容次第で結果が変わる。
class VariableExpression(private val name: String) : Expression {
    override fun interpret(context: Context): Double = context.getValue(name)
}