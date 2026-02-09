package com.example.designpatternpractice.iterator

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ClubTeamIteratorTest {

    @Test
    fun iterateAllMembers() {
        val clubTeam = ClubTeam()
        clubTeam.addMember(Member(name = "Taro", age = 10))
        clubTeam.addMember(Member(name = "Jiro", age = 12))
        clubTeam.addMember(Member(name = "Saburo", age = 11))

        val iterator = clubTeam.iterator()
        val names = mutableListOf<String>()

        while (iterator.hasNext()) {
            val member = iterator.next() as Member
            names.add(member.name)
        }

        assertEquals(listOf("Taro", "Jiro", "Saburo"), names)
    }

    @Test
    fun emptyTeam() {
        val clubTeam = ClubTeam()
        val iterator = clubTeam.iterator()

        assertFalse(iterator.hasNext())
    }

    @Test
    fun singleMember() {
        val clubTeam = ClubTeam()
        clubTeam.addMember(Member(name = "Taro", age = 10))

        val iterator = clubTeam.iterator()

        assertTrue(iterator.hasNext())
        val member = iterator.next() as Member
        assertEquals("Taro", member.name)
        assertEquals(10, member.age)
        assertFalse(iterator.hasNext())
    }

    @Test
    fun memberProperties() {
        val clubTeam = ClubTeam()
        clubTeam.addMember(Member(name = "Taro", age = 10))
        clubTeam.addMember(Member(name = "Jiro", age = 12))

        val iterator = clubTeam.iterator()
        val ages = mutableListOf<Int>()

        while (iterator.hasNext()) {
            val member = iterator.next() as Member
            ages.add(member.age)
        }

        assertEquals(listOf(10, 12), ages)
    }
}