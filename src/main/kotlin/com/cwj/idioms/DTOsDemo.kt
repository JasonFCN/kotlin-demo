package com.cwj.idioms

import java.time.LocalDateTime

/**
 * @author wujie.chen
 * 2023/1/29 10:28
 */
fun main() {
    val timeRange = TimeRange(LocalDateTime.now(), LocalDateTime.now())
    // toString()
    println("toString(): ${timeRange.toString()}")

    // setter
    timeRange.start = LocalDateTime.now()
    timeRange.end = LocalDateTime.now()
    println("after call setter: ${timeRange.toString()}")


    // getter
    println("get properties: start ${timeRange.start}")
    println("get properties: end ${timeRange.end}")

    // equals()
    val timeRange2 = TimeRange(LocalDateTime.now(), LocalDateTime.now())
    println("timeRange equals timeRange2 ? ${timeRange.equals(timeRange2)}")

    // hashCode()
    println("hashCode() is ${timeRange.hashCode()}")

    // copy()
    val copy = timeRange.copy(end = LocalDateTime.now().plusDays(1))
    println("copy: $copy")

}

data class TimeRange(var start: LocalDateTime, var end: LocalDateTime)