package com.example.designpatternpractice.interpreter

// Interpreter パターンの NonTerminalExpression（非終端記号）― 除算
// left・right を再帰的に interpret() して商を返す。
class DivExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret(context: Context): Double = left.interpret(context) / right.interpret(context)
}
