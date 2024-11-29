package com.example.tutto7

// Filter and Transform Data
val numbers = listOf(1, 2, 3, 4, 5)
val evenNumbers = numbers.filter { it % 2 == 0 }  // Keep even numbers: [2, 4]
val squares = numbers.map { it * it }  // Square each number: [1, 4, 9, 16, 25]
        
fun main() {
    println(evenNumbers)
    println(squares)
    numbers.forEach {
        println(it)
    } // Prints each number
}