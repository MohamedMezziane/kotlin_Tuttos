package com.example.tutto7
/*
// Higher-Order Functions
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Using the function:
val sum = operate(1000, 1001) { x, y -> x + y } // 8
val product = operate(1002, 2) { x, y -> x * y } // 15


fun main() {
    println("Sum: $sum, Product: $product")

}
*/

val nummbers = listOf(5, 15, 20, 8)
val filtered = nummbers.filter { it > 10 } // [15, 20]

val words = listOf("hello", "world")
val upperWords = words.map { it.uppercase() } // ["HELLO", "WORLD"]


fun main() {
    println(filtered)
    println(upperWords)
}