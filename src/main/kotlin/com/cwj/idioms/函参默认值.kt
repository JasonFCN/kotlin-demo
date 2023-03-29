package com.cwj.idioms

/**
 * @author wujie.chen
 * 2023/1/29 11:12
 */
fun main() {
    var i = 0
    println("call incr() default incr: ${incr(i)}")
    println("call incr() given incr: ${incr(i,2)}")
}

fun incr(i: Int, incr: Int = 1): Int {
    return i + incr
}
