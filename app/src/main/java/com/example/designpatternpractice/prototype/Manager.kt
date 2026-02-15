package com.example.designpatternpractice.prototype

/**
 * Client役（Manager）
 * - Prototypeインターフェースのみに依存し、具象クラス（MailSign, BusinessCardなど）を知らない
 * - register()で原型を登録し、create()でcloneを生成する
 * - 新しい具象クラスが追加されても、このクラスを変更する必要がない
 */
class Manager {
    val signs: HashMap<String, Prototype> = HashMap()
    fun register(name: String, proto: Prototype) {
        signs[name] = proto
    }
    fun create(name: String): Prototype? {
        return signs[name]?.createClone()
    }
}