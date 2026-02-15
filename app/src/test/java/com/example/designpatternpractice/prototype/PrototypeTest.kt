package com.example.designpatternpractice.prototype

import org.junit.Test

class PrototypeTest {

    @Test
    fun PrototypeTest(){
        val manager = Manager()
        val companySign : Prototype = MailSign(name = "John Harry", mail = "harry.jhon@facecompany.com")
        manager.register("company", companySign)

        val homeSign : Prototype = MailSign(name = "John Harry", mail = "harry.john@home.com")
        manager.register("home", homeSign)

        val businessCard: Prototype = BusinessCard(
            name = "John Harry",
            company = "fake company",
            phone = "0120-000-000",
        )
        manager.register("businessCard", businessCard)

        // 生成
        val p1: Prototype? = manager.create("company")
        p1?.printSign()

        val p2: Prototype? = manager.create("home")
        p2?.printSign()

        val p3: Prototype? = manager.create("businessCard")
        p3?.printSign()

    }
}