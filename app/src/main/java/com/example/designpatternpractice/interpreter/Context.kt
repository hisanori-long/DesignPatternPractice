package com.example.designpatternpractice.interpreter

// Interpreter パターンの Context（文脈）
// 変数名と値のマッピングを保持し、VariableExpression が interpret() 時に参照する。
// 同じ式ツリーでも Context の内容を変えることで異なる結果を得られる。
class Context {
    private val variables = mutableMapOf<String, Double>()

    fun setValue(name: String, value: Double){
        variables[name] = value
    }

    fun getValue(name: String): Double =
        variables[name] ?: throw IllegalArgumentException("値が存在しません: $name")
}