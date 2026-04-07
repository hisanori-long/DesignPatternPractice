package com.example.designpatternpractice.visitor

import org.junit.Test

class VisitorTest {
    
    @Test
    fun visitorTest() {

        val company: OrganizationComponent = Group("abc film")
        val sales: OrganizationComponent = Group("sales departure")
        val consumerSales: OrganizationComponent = Group("consumer sales division")
        val businessSales: OrganizationComponent = Group("business sales division")
        val development: OrganizationComponent = Group("development departure")

        company.addMember(sales)
        company.addMember(development)
        sales.addMember(consumerSales)
        sales.addMember(businessSales)

        val takeshi: OrganizationComponent = Member("Takeshi")
        val hanako: OrganizationComponent = Member("Hanako")
        val jiro: OrganizationComponent = Member("Jiro")
        val goro: OrganizationComponent = Member("Goro")
        val rikako: OrganizationComponent = Member("Rikako")
        val cho: OrganizationComponent = Member("Cho")

        company.addMember(takeshi)
        sales.addMember(hanako)
        consumerSales.addMember(jiro)
        consumerSales.addMember(goro)
        businessSales.addMember(rikako)
        development.addMember(cho)

        val visitor: Visitor = ShowNameVisitor()

        company.accept(visitor)
    }
}