package com.example.designpatternpractice.adapter

import com.example.designpatternpractice.adapter.inheritance.LocalDateTimeProvider
import com.example.designpatternpractice.adapter.inheritance.UtcToLocalDateTimeAdapter
import org.junit.Assert
import org.junit.Test
import java.time.ZoneId

class InheritanceTest {
    @Test
    fun inheritanceTest() {
        val provider: LocalDateTimeProvider = UtcToLocalDateTimeAdapter()
        val localDateTime = provider.getLocalTime(ZoneId.of("Asia/Tokyo"))
        Assert.assertNotNull(localDateTime)
    }
}