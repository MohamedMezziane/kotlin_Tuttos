package com.example.tuttorial4

val numbers = listOf(1, 2, 3, 4, 5, 6)
val evenNumbers = numbers.filter { it % 2 == 0 }  // [2, 4, 6]
val squaredNumbers = numbers.map { it * it }  // [1, 4, 9, 16, 25, 36]

