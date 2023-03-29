package com.cwj.basic

import java.io.File

/**
 * @author wujie.chen
 * 2023/1/28 17:13
 */
fun main() {
    // If-not-null shorthand
    var files = File("Test").listFiles()
    println(files?.size) // size is printed if files is not null

    // If-not-null-else shorthand
    println(files?.size ?: "empty") // if files is null, this prints "empty"

    // Execute a statement if null
    val values = mapOf("A" to 1, "C" to 3)
    val b = values["C"] ?: throw IllegalStateException("C is missing!")

    // Get first item of a possibly empty collection
    val emails = listOf(null) // might be empty
    val mainEmail = emails.firstOrNull() ?: ""
    println("mainEmail: $mainEmail")

    // Execute if not null
    val value = "hello"
    value?.let {
        // execute this block if not null
        println("$value is not null, call let block")
    }
}
/*
  如果一个引用可能为null，通过(?)必须显式标记为可以为空。
 */
fun parseInt(str: String): Int? {
    return null
}
fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if(x != null && y != null){
        println(x * y)
    }else{
        println("'$arg1' or '$arg2' is not a number")
    }
}

