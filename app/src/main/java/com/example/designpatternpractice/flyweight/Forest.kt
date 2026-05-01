package com.example.designpatternpractice.flyweight

// Context（クライアント側）: 外部状態（extrinsic state）を保持する
// Flyweightである TreeType への参照と、インスタンスごとに異なる Position を組み合わせる
class Forest(treeInfoList: List<Pair<String, Position>>) {
    private val treeList: MutableList<Tree> = mutableListOf()
    init {
        treeInfoList.forEach { treeInfo ->
            val tree = Tree(TreeTypeFactory.getTreeType(treeInfo.first), treeInfo.second)
            treeList.add(tree)
        }
    }

    fun printForest(){
        treeList.forEach { tree ->
            println(tree)
        }
    }
}

// 外部状態（extrinsic state）のコンテナ
// treeType は共有される Flyweight、position は木ごとに異なる固有の状態
data class Tree(val treeType: TreeType, val position: Position)

// 外部状態: 各木の位置（緯度・経度）
data class Position(val lat: Int, val lon: Int)
