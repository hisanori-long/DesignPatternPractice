package com.example.designpatternpractice.abstractFactory

import com.example.designpatternpractice.abstractFactory.factory.Factory
import com.example.designpatternpractice.abstractFactory.htmlList.ConcreteFactory
import org.junit.Test

// Client役: Factoryの抽象インターフェースのみを使って製品を生成・組み立てする
// ConcreteFactoryを差し替えるだけで、異なる形式の出力に切り替えられる
class AbstractFactoryTest {
    @Test
    fun abstractFactory(){
        // ここを別のConcreteFactoryに差し替えれば、テストコードの他の部分は一切変更不要
        val factory: Factory = ConcreteFactory()

        // fruit
        val fruitList = factory.createList("fruit")

        val apple = factory.createItem("apple")
        val orange = factory.createItem("orange")
        val grape = factory.createItem("grape")

        fruitList.add(apple)
        fruitList.add(orange)
        fruitList.add(grape)

        // car
        val carList = factory.createList("car")

        val afeela = factory.createItem("afeela")
        val honda = factory.createItem("honda")

        carList.add(afeela)
        carList.add(honda)

        // sport
        val soccer = factory.createItem("soccer")

        // createFile
        val file = factory.createFile("my portfolio")
        file.add(fruitList)
        file.add(carList)
        file.add(soccer)

        file.output()
    }
}