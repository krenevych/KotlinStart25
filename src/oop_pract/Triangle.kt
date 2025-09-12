package oop_pract

class Triangle(
    var a: Float,
    var b: Float = a,
    var c: Float = a
) {

    init {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw IllegalArgumentException("All sides should be positive")
        }
        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            throw IllegalArgumentException("Not a triangle")
        }
    }

    override fun toString(): String {
        return "Triangle(a=$a, b=$b, c=$c)"
    }
}