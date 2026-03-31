package com.example.designpatternpractice.composite

/** Composite（葉ノード）クラス */
class Member(name: String) : OrganizationComponent(name) {
    override fun getMember(): String {
        return "(${this.name})"
    }
}