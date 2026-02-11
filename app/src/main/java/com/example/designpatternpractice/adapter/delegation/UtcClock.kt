package com.example.designpatternpractice.adapter.delegation

import java.time.Instant

/**
 * Adaptee: 既存のインターフェースが異なるクラス
 */
class UtcClock {
    /**
     * Utc時刻でInstantを返す
     */
    fun getUtcTime(): Instant {
        return Instant.now()
    }
}