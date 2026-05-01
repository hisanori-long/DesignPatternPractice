package com.example.designpatternpractice.flyweight

// FlyweightFactory: Flyweightオブジェクトの生成・共有を管理する
// 既存インスタンスを返すことで、同一種の木が複数あっても TreeType は1つしか存在しない
object TreeTypeFactory {
    // キャッシュ: 種名 → TreeType インスタンス（共有プール）
    private val treePool : HashMap<String, TreeType> = hashMapOf()

    fun getTreeType(name: String):  TreeType =
        treePool.getOrPut(name) { TreeType(name, speciesData[name] ?: defaultTree) }


    private val speciesData = mapOf(
        "Oak"    to TreeTexture("oak_texture.png",    ByteArray(1024)),
        "Cherry" to TreeTexture("cherry_texture.png", ByteArray(1024)),
        "Pine"   to TreeTexture("pine_texture.png",   ByteArray(1024)),
        )

    private val defaultTree = TreeTexture("default_tree.png", ByteArray(1024))

}