package com.cwj.basic

/**
 * @author wujie.chen
 * 2023/1/28 16:33
 */
fun main() {
    val code = 1
    println("$code 代表性别: ${genderDescribe(code)}")
}

fun genderDescribe(code: Int): String =
    when (code) {
        0 -> "女"
        1 -> "男"
        else -> "其他"
    }