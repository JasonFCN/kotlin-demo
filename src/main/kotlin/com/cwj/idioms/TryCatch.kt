package com.cwj.idioms

/**
 * @author wujie.chen
 * 2023/1/29 14:21
 */
fun main() {

}

fun test(){
    val result = try {
        count()
    }catch (e: ArithmeticException){
        throw IllegalStateException(e)
    }
}

fun count(){
    throw ArithmeticException()
}