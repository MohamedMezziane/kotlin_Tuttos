package com.example.tutto7

// Map: Stores key-value pairs.
val phoneBook = mapOf(
    "John" to "1234",
    "Jane" to "5678",
    "Adam" to "01",
    "Idriss" to "XX10",
    "Ibrahim" to "XX20"
)

fun main() {
    println(phoneBook["John"]) // 1234
    println(phoneBook["Idriss"])

}