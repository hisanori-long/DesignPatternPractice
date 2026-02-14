package com.example.designpatternpractice.template

import org.junit.Test

/**
 * CookingDinner の Template Method パターンのテスト
 *
 * リスコフの置換原則（LSP）に従い、すべてのサブクラス（Hamburger, Curry, Pasta）は
 * 親クラス CookingDinner 型として扱っても正しく動作することを確認する。
 * cook() を呼び出すだけで、各サブクラス固有の処理が実行される。
 */
class CookingDinnerTest {

    /**
     * サブクラスを CookingDinner 型の変数に代入しても、
     * cook() の呼び出しで各サブクラスの実装が正しく動作することを確認する
     */
    @Test
    fun cookHamburger() {
        val dinner: CookingDinner = Hamburger()
        dinner.cook()
    }

    @Test
    fun cookCurry() {
        val dinner: CookingDinner = Curry()
        dinner.cook()
    }

    @Test
    fun cookPasta() {
        val dinner: CookingDinner = Pasta()
        dinner.cook()
    }
}