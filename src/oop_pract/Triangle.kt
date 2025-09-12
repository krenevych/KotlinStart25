package oop_pract

class Triangle(
    a: Float,
    b: Float = a,
    c: Float = a
) {

    var a: Float = a
        set(value) {
            if (value <= 0) {
                throw IllegalArgumentException("Side should be positive")
            }
            if (!checkTringle(value, b, c)) {
                throw IllegalArgumentException("Not a triangle")
            }
            field = value
        }
    var b: Float = b
    var c: Float = c

    init {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw IllegalArgumentException("All sides should be positive")
        }
        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            throw IllegalArgumentException("Not a triangle")
        }
    }

//    fun perimeter(): Float {
//        return a + b + c
//    }
//    fun perimeter() = a + b + c

    val perimeter
        get() = a + b + c

//    val perimeter get() = a + b + c

    constructor(
        a: Int,
        b: Int = a,
        c: Int = a
    ) : this(
        a.toFloat(),
        b.toFloat(),
        c.toFloat()
    )

    override fun toString(): String {
        return "Triangle(a=$a, b=$b, c=$c)"
    }

    companion object {

        fun checkTringle(a: Float, b: Float, c: Float): Boolean {
            return a < (b + c) && b < (a + c) && c < (a + b)
        }

    }
}
