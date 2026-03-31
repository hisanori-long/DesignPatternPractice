package com.example.designpatternpractice.composite


/**
 * GroupとMemberの共通インターフェースを定義
 * クライアントはこの型を通じて操作するため、GroupとMemberを同一視できる（Transparency）。
 */
abstract class OrganizationComponent(val name: String) {

    /**
     * 自身の名前と、子要素の情報を再帰的に文字列として返す
     */
    abstract fun getMember(): String

    /**
     * Leafクラス（Member）はこのメソッドをサポートしないため、デフォルトで例外を投げる
     */
    open fun addComponent(component: OrganizationComponent) {
        throw UnsupportedOperationException("this method is not allowed in this leaf class.")
    }
}