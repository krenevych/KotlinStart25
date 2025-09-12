package oop_pract

fun main() {

    println("Hello World!")

    val triangle = Triangle(3.0f, 4.0f, 5.0f)
    val triangle1 = Triangle(3, 4, 5)
//    val triangle1 = Triangle(3.toFloat(), 4.toFloat(), 5.toFloat())
    println(triangle)
    println(triangle1)

    triangle.a = 4.0f
    println(triangle)


//    println(Triangle.checkTringle(4f, 5f, 6f))

    println(triangle.perimeter)

//    triangle.perimeter = 10f
}