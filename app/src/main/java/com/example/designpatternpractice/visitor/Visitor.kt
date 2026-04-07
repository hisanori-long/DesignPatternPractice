package com.example.designpatternpractice.visitor

// Visitorパターンにおける「訪問者」のインターフェース。
// 要素の種類ごとに visit() メソッドをオーバーロードで定義する（ダブルディスパッチ）。
// 新しい操作を追加したい場合は、このインターフェースを実装した新しいVisitorクラスを作ればよく、
// 要素クラス（Group, Member）側は一切変更不要。
interface Visitor {
    fun visit(group: Group)
    fun visit(member: Member)
}