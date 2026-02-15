package com.example.designpatternpractice.prototype

import android.util.Log


/**
 * ConcretePrototype役
 * - Prototypeインターフェースを実装し、createClone()で自身のコピーを返す
 * - clone()はObject.clone()によるシャローコピーを行い、Prototype型にキャストして返す
 */
class MailSign(val name: String, val mail: String): Prototype {
    override fun createClone(): Prototype? {
        var proto : Prototype? = null
        try {
            proto = this.clone() as Prototype // Prototype型でキャスト
        } catch (error: CloneNotSupportedException) {
            Log.e(tag, error.localizedMessage?: "No error message.")
        }
        return proto
    }

    override fun printSign() {
        println("=".repeat(20))
        println("Name: $name")
        println("Mail: $mail")
        println()
    }
}

private val tag = "MailSign"