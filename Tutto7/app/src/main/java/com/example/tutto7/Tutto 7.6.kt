package com.example.tutto7

// Generic Class
class Box<T>(val content: T) {
    fun showContent() {
        println(content)
    }
}

val intBox = Box(100)
val stringBox = Box("Kotlin")
val Name = Box("Mezziane")


fun main() {
    intBox.showContent()     // 100
    stringBox.showContent()  // Kotlin
    Name.showContent() // Mezziane
}