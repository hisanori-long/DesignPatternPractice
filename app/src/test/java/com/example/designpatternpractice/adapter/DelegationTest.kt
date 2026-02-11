package com.example.designpatternpractice.adapter

import com.example.designpatternpractice.adapter.delegation.LocalDateTimeProvider
import com.example.designpatternpractice.adapter.delegation.UtcToLocalDateTimeAdapter
import org.junit.Assert
import org.junit.Test
import java.time.ZoneId

class DelegationTest {
    @Test
    fun delegateTest(){
        val provider: LocalDateTimeProvider = UtcToLocalDateTimeAdapter()
        val localDateTime = provider.getLocalTime(ZoneId.of("Asia/Tokyo"))
        Assert.assertNotNull(localDateTime)
    }
}