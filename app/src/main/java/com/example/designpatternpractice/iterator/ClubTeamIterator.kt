package com.example.designpatternpractice.iterator

internal class ClubTeamIterator(clubTeam: ClubTeam): Iterator {
    private val clubTeam: ClubTeam
    private var index: Int

    init {
        this.clubTeam = clubTeam
        this.index = 0
    }

    override fun hasNext(): Boolean {
        return this.index < this.clubTeam.getSize()
    }

    override fun next(): Member {
        val member = this.clubTeam.getMemberAt(this.index)
        this.index += 1
        return member
    }
}