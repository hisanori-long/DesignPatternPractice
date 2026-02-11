package com.example.designpatternpractice.adapter.inheritance

import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Adapter: Adaptee(UtcClock)を継承し、Target(LocalDateTimeProvider)のインターフェースに変換する
 */
class UtcToLocalDateTimeAdapter : UtcClock(), LocalDateTimeProvider {
    override fun getLocalTime(zoneId: ZoneId): LocalDateTime {
        val utcInstant = getUtcTime()
        return LocalDateTime.ofInstant(utcInstant, zoneId)
    }
}