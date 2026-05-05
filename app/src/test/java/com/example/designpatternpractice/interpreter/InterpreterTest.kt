package com.example.designpatternpractice.interpreter

import org.junit.Test

class InterpreterTest {

    @Test
    fun interpret() {
        val context = Context()
        context.setValue("x", 3.0)
        context.setValue("y", 5.0)

        val parser = Parser()

        listOf(
            "x + y - 1",
            "x * 2 + y",
            "(x + y) * 2",
            "y / x - 1",
            "10 + 2.5",
        ).forEach { expr ->
            println("$expr = ${parser.parse(expr).interpret(context)}")
        }
    }
}
