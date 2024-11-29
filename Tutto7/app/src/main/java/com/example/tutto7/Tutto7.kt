package com.example.tutto7

// List: Stores ordered items, may include duplicates.
val fruits = listOf("Apple", "Banana", "Cherry") // Cannot change
val mutableFruits = mutableListOf("Apple", "Banana") // Can change

fun main() {
    println(fruits)
    println(mutableFruits)

    mutableFruits.add("Orange")
    println(mutableFruits) // [Apple, Banana, Orange]
}