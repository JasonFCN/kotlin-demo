package com.cwj.basic.classdemo

/**
 * @author wujie.chen
 * 2023/1/28 15:41
 */
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

/**
 * 类继承通过(:)来定义，类定义默认是final的，要使类可继承，可以使用(open)关键字修饰类定义: [Shape]
 */
class Rectangle2(private var height: Double, private var length: Double) : Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    var rectangle = Rectangle(3.0, 4.0)
    println("The perimeter is ${rectangle.perimeter}")
}
