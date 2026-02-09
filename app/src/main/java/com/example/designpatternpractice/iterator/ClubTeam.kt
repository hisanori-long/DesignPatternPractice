package com.example.designpatternpractice.iterator

internal class ClubTeam() : Collection {
    // ClubTeamクラス内でしか操作できないようにprivate
    private val members: MutableList<Member> = mutableListOf<Member>()

    fun getMemberAt(index: Int): Member {
        return members[index]
    }

    fun getSize(): Int {
        return members.size
    }

    fun addMember(member: Member) {
        this.members.add(member)
    }

    override fun iterator(): Iterator {
        return ClubTeamIterator(this)
    }
}