package com.cwj.basic

/**
 * @author wujie.chen
 * 2023/1/28 16:26
 */
fun main() {
    val items = listOf("a", "b", "c", "d")
    for (item in items){
        println(item)
    }

    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

    val iterator = items.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}