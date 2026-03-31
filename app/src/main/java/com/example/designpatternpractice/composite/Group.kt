package com.example.designpatternpractice.composite


/** Composite（枝ノード）クラス */
class Group(name: String) : OrganizationComponent(name = name) {
    // 子要素はaddComponent()経由でのみ追加できるようprivateにする
    private val components: MutableList<OrganizationComponent> = mutableListOf()

    // 自身の名前を起点に、子要素を再帰的に展開してツリー形式の文字列を返す
    override fun getMember(): String {
        var result = this.name
        components.forEach {
            // 子要素の内部改行にもインデントを追加することで、階層の深さを正しく表現する
            result += "\n   └──${it.getMember().replace("\n", "\n   ")}"
        }
        return result
    }

    // 子要素としてGroupまたはMemberを追加する
    override fun addComponent(component: OrganizationComponent) {
        components.add(component)
    }
}