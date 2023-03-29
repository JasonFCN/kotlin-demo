package com.cwj.idioms

/**
 * @author wujie.chen
 * 2023/1/29 14:29
 */
fun main() {
    val arrayOfMinusOnes = arrayOfMinusOnes(10)
    arrayOfMinusOnes.forEach { println(it) }
}

fun arrayOfMinusOnes(size: Int): IntArray{
    return IntArray(size).apply { fill(-1) }
}