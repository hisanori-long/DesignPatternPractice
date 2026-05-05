package com.example.designpatternpractice.interpreter

// Interpreter パターンの Client が使うパーサー
// 文字列の計算式を再帰降下構文解析して Expression ツリーを構築する。
// parseExpression → parseTerm → parseFactor の呼び出し順で * / > + - の演算子優先度を実現する。
class Parser {
    private var tokens: List<String> = emptyList()
    private var pos: Int = 0

    fun parse(input: String): Expression {
        tokens = tokenize(input)
        pos = 0
        return parseExpression()
    }

    private fun tokenize(input: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < input.length) {
            when {
                input[i].isWhitespace() -> i++
                input[i].isDigit() || input[i] == '.' -> {
                    val start = i
                    while (i < input.length && (input[i].isDigit() || input[i] == '.')) i++
                    result.add(input.substring(start, i))
                }
                input[i].isLetter() -> {
                    val start = i
                    while (i < input.length && input[i].isLetterOrDigit()) i++
                    result.add(input.substring(start, i))
                }
                input[i] in "+-*/()" -> result.add(input[i++].toString())
                else -> throw IllegalArgumentException("不明な文字: ${input[i]}")
            }
        }
        return result
    }

    private fun parseExpression(): Expression {
        var left = parseTerm()
        while (pos < tokens.size && tokens[pos] in listOf("+", "-")) {
            val op = tokens[pos++]
            val right = parseTerm()
            left = if (op == "+") AddExpression(left, right) else SubExpression(left, right)
        }
        return left
    }

    private fun parseTerm(): Expression {
        var left = parseFactor()
        while (pos < tokens.size && tokens[pos] in listOf("*", "/")) {
            val op = tokens[pos++]
            val right = parseFactor()
            left = if (op == "*") MulExpression(left, right) else DivExpression(left, right)
        }
        return left
    }

    private fun parseFactor(): Expression {
        val token = tokens[pos]
        return when {
            token == "(" -> {
                pos++
                val expr = parseExpression()
                require(tokens[pos] == ")") { "')' が必要です" }
                pos++
                expr
            }
            token[0].isDigit() || token[0] == '.' -> {
                pos++
                NumberExpression(token.toDouble())
            }
            token[0].isLetter() -> {
                pos++
                VariableExpression(token)
            }
            else -> throw IllegalArgumentException("予期しないトークン: $token")
        }
    }
}
