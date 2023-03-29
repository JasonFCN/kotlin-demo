package com.cwj.basic

/**
 * @author wujie.chen
 * 2023/1/28 17:39
 */
fun main() {

}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 在类型检测分支中,自动转换类型
        return obj.length
    }
    return null
}