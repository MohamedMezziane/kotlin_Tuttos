package com.example.tuttorial4

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {


    val sumN = calc(20, 80) {x , y -> x + y} // Passe une lambda comme opération
    println("The Result is : $sumN")

}