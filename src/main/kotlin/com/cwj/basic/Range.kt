package com.cwj.basic

/**
 * @author wujie.chen
 * 2023/1/28 16:40
 */
fun main() {
    val x = 10
    val y = 9
    // 条件中的范围
    if (x in 1..y + 1) {
        println("fits in range")
    }

    // 循环中的范围
    for (i in 1..10) {
        println(i)
    }
    println()
    for (i in 1..10 step 2) {
        print(i)
    }
    println()
    for (i in 1..10 step 3) {
        print(i)
    }
}