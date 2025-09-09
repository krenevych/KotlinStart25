package functions



fun main() {
    val upperCaseString = { text: String ->
        println(text)
        println(text)
        println(text.length)
        println("Hello, from uppercase")

        text.uppercase()  // return isn't needed
    }

    val otherNameOfUpperCaseString = upperCaseString

    val resFromUppercaseFunction = otherNameOfUpperCaseString("hello")

    println("result from otherNameOfUpperCaseString: $resFromUppercaseFunction")



}