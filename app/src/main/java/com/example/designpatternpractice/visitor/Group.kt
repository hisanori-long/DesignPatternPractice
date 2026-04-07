package com.example.designpatternpractice.visitor

// 複数の OrganizationComponent を子要素として持つ複合ノード（グループ・部署など）。
class Group(override val name: String): OrganizationComponent {
    private val componentList = mutableListOf<OrganizationComponent>()

    override fun addMember(component: OrganizationComponent) {
        componentList.add(component)
    }

    // 【トラバーサルの責務について】
    // accept() の中で自身への visit() 呼び出しと、子要素への accept() 再帰呼び出しを両方行っている。
    // これにより、Visitor は「どのように構造を辿るか」を知らなくてよくなる。
    //
    // もし Visitor 側でトラバーサルを制御しようとすると、
    // Visitor が Group の内部構造（子要素リストの取得方法など）を知る必要が生じ、
    // 要素とVisitorの結合度が高まってしまう。
    // トラバーサルを要素側（Group.accept）に閉じ込めることで、
    // Visitor は「各要素に到達したときに何をするか」だけに集中できる。
    override fun accept(visitor: Visitor){
        visitor.visit(this)
        componentList.forEach { it.accept(visitor) }
    }
}