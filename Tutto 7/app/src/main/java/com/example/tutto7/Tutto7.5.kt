package com.example.tutto7

// Generic Function
fun <T> printElement(item: T) {
    println(item)
}

fun main() {
    printElement(42)       // Prints: 42
    printElement("Hello")  // Prints: Hello
    printElement(2001)
}