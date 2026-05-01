package com.example.designpatternpractice.flyweight

// Flyweight: 内部状態（intrinsic state）のみを持つ共有オブジェクト
// 同じ種名の木は全てこのインスタンスを共有し、メモリを節約する
class TreeType(val name: String, val texture: TreeTexture)

// ByteArray は大きくなり得るデータの代替として使用（実際のテクスチア画像を想定）
class TreeTexture(val name: String, val data: ByteArray)