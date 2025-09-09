package functions//fun functions.max(x: Int, y: Int) : Int {
//    if (x > y) {
//        return x
//    } else {
//        return y
//    }
//}

//fun functions.max(x: Int, y: Int) : Int {
//    return if (x > y) x else y
//}

//fun functions.max(x: Int, y: Int) : Int = if (x > y) x else y

fun maxCustomKotlin(x: Int, y: Int) = if (x > y) x else y

fun main() {

//    println(maxCustomKotlin(3, 4))
    println(maxCustomKotlin(y=3, x=4))

}