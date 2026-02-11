package com.example.designpatternpractice.adapter.inheritance

import java.time.Instant

/**
 * Adaptee: 既存のインターフェースが異なるクラス
 */
open class UtcClock {
    /**
     * Utc時刻でInstantを返す
     */
    fun getUtcTime(): Instant {
        return Instant.now()
    }
}