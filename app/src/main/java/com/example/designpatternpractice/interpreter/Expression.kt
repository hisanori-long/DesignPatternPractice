package com.example.designpatternpractice.interpreter

// Interpreter パターンの AbstractExpression（抽象表現）
// 終端記号（NumberExpression, VariableExpression）と非終端記号（AddExpression など）が実装する共通インターフェース。
// クライアントはこのインターフェース経由で式を評価するため、具体的な式の種類を意識しない。
interface Expression {
    fun interpret(context: Context): Double
}