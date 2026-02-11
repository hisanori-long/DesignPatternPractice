package com.example.designpatternpractice.adapter.inheritance

import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Target: クライアントが期待するインターフェース
 */
interface LocalDateTimeProvider {
    /**
     * @param zoneId タイムゾーンのID
     * @return 指定タイムゾーンのローカル時刻
     */
    fun getLocalTime(zoneId: ZoneId): LocalDateTime
}