package com.example.designpatternpractice.composite

import org.junit.Test

class CompositeTest {

    @Test
    fun compositeTest(){
        val company: OrganizationComponent = Group("abc film")
        val sales: OrganizationComponent = Group("sales departure")
        val consumerSales: OrganizationComponent = Group("consumer sales division")
        val businessSales: OrganizationComponent = Group("business sales division")
        val development: OrganizationComponent = Group("development departure")

        company.addComponent(sales)
        company.addComponent(development)
        sales.addComponent(consumerSales)
        sales.addComponent(businessSales)

        val takeshi: OrganizationComponent = Member("Takeshi")
        val hanako: OrganizationComponent = Member("Hanako")
        val jiro: OrganizationComponent = Member("Jiro")
        val goro: OrganizationComponent = Member("Goro")
        val rikako: OrganizationComponent = Member("rikako")
        val cho: OrganizationComponent = Member("Cho")

        company.addComponent(takeshi)
        sales.addComponent(hanako)
        consumerSales.addComponent(jiro)
        consumerSales.addComponent(goro)
        businessSales.addComponent(rikako)
        development.addComponent(cho)

        println(company.getMember())

    }
}