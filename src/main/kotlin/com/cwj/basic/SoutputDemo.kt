package com.cwj.basic

/**
 * @author wujie.chen
 * 2023/1/28 14:09
 */
fun main() {
    // 控制台输出
    print("hello ")
    print("world! \n")
    println("hello world!")

    // 模板字符串
    val name = "tom"
    println("你好，我的名字叫$name")

    // 文本块
    println(
        """
        春眠不觉晓，
        处处闻啼鸟。
        夜来风雨声，
        花落知多少。
    """.trimIndent()
    )

    // 控制台输入
    val input = readLine()
    println(input)

    // 变量声明
    // 1. val 关键字声明一个只读变量，意味着不可变
    val a = 1
    // a = 2

    // 2. var 关键字声明一个普通变量，可以重新赋值
    var b = 2
    b = 3

    // 变量可以声明在函数之外
    fun incrementB(){
        b += 1
    }
}

// 标准函数定义
fun sum(a: Int, b: Int): Int{
    return a + b
}

// 函数表达式，返回类型是自行推断的
fun sum2(a: Int, b: Int) = a + b

// 无返回值函数，返回类型可以省略
fun printSum(a: Int , b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}




