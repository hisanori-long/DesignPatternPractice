package com.example.designpatternpractice.adapter.delegation

import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Target: クライアントが期待するインターフェース
 */
abstract class LocalDateTimeProvider {
     /**
      * @param zoneId タイムゾーンのID
      * @return 指定タイムゾーンのローカル時刻
      */
     abstract fun getLocalTime(zoneId: ZoneId): LocalDateTime
}