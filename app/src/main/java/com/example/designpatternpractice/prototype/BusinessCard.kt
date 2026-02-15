package com.example.designpatternpractice.prototype

import android.util.Log

/**
 * ConcretePrototype役
 * - MailSignとは異なるプロパティを持つが、同じPrototypeインターフェースでコピーを生成できる
 */
class BusinessCard(val name: String, val company: String, val phone: String): Prototype {
    override fun createClone(): Prototype? {
        var proto: Prototype? = null
        try {
            proto = this.clone() as Prototype
        } catch (error: CloneNotSupportedException) {
            Log.e(tag, error.localizedMessage ?: "No error message.")
        }
        return proto
    }

    override fun printSign() {
        println("+".repeat(20))
        println("Name: $name")
        println("Company: $company")
        println("Phone: $phone")
        println("+".repeat(20))
    }
}

private val tag = "BusinessCard"