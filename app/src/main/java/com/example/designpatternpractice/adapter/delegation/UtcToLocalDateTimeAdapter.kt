package com.example.designpatternpractice.adapter.delegation

import com.example.designpatternpractice.adapter.delegation.LocalDateTimeProvider
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Adapter: Target(LocalDateTimeProvider)を継承し、Adaptee(UtcClock)にインスタンスで委譲して変換する
 */
class UtcToLocalDateTimeAdapter: LocalDateTimeProvider() {
    val utcClock = UtcClock()
    override fun getLocalTime(zoneId: ZoneId): LocalDateTime{
        val utcInstant = utcClock.getUtcTime()
        return LocalDateTime.ofInstant(utcInstant, zoneId)
    }
}