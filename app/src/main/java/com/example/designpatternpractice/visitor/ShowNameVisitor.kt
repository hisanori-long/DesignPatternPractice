package com.example.designpatternpractice.visitor

// Visitor の具体実装。各要素の名前を表示する。
// このクラスは「各要素に到達したときに何をするか」だけを記述し、
// 構造のトラバーサルは一切行わない（Group.accept に委ねている）。
// 新しい操作（例：役職の集計、権限チェック）が必要になったら、
// このクラスとは別に新しい Visitor を実装すればよく、要素クラスは変更不要。
class ShowNameVisitor: Visitor {
    override fun visit(group: Group) {
        println("組織：${group.name}を訪れました")
    }

    override fun visit(member: Member) {
        println("メンバー：${member.name}を訪れました")
    }
}