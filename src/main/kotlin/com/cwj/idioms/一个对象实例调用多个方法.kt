package com.cwj.idioms

/**
 * @author wujie.chen
 * 2023/1/29 14:41
 */
fun main() {
    val turtle = Turtle()
    with(turtle){
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}