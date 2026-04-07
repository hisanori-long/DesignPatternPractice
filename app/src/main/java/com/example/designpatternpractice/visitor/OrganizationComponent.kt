package com.example.designpatternpractice.visitor

// Visitorパターンにおける「要素」のインターフェース。
// accept() でVisitorを受け入れることで、処理の追加を要素クラスの変更なしに実現できる。
// addMember() はCompositeパターンのように階層構造を構築するためのメソッド。
// 葉要素（Member）では利用しないため、デフォルト実装で例外をスローしている。
interface OrganizationComponent {
    val name: String
    fun addMember(component: OrganizationComponent){ throw UnsupportedOperationException(" このクラスにはメンバーは追加できません ") }

    fun accept(visitor: Visitor)
}