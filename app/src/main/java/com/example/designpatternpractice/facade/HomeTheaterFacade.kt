package com.example.designpatternpractice.facade

// 【Facadeパターン】
// 複数のサブシステム（Amplifier, DVDPlayer, Projector）をまとめ、
// クライアントに対してシンプルなインターフェースを提供するクラス。
//
// クライアントはこのFacadeを通じてのみ操作し、
// 各サブシステムの複雑な手順を意識しなくて済む。
//
// サブシステムはコンストラクタで注入することで、テスト時に差し替え可能にしている。
class HomeTheaterFacade(val amplifier: Amplifier, val dvdPlayer: DVDPlayer, val projector: Projector) {

    // 映画を観るための複数の操作を1メソッドに集約
    fun playMovie(movie: String, volume: Int) {

        projector.on()
        amplifier.on()
        dvdPlayer.on()

        amplifier.setVolume(volume)
        dvdPlayer.play(movie)

    }

    // 終了時の複数の操作を1メソッドに集約
    fun endMovie() {
        projector.off()
        amplifier.off()
        dvdPlayer.off()
    }
}