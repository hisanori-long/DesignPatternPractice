package com.example.designpatternpractice.visitor

// 子要素を持たない末端ノード（個人メンバー）。
// accept() では自身を visit() に渡すだけで、トラバーサルは不要。
class Member(override val name: String): OrganizationComponent {

    override fun accept(visitor: Visitor){
        visitor.visit(this)
    }
}