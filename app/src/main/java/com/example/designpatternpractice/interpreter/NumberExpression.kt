package com.example.designpatternpractice.interpreter

// Interpreter パターンの TerminalExpression（終端記号）― 数値リテラル
// Context を参照せず、コンストラクタで受け取った値をそのまま返す。
class NumberExpression(private val value: Double) : Expression {
    override fun interpret(context: Context): Double = value
}