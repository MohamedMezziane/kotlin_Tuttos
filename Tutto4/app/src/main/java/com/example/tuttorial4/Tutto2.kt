package com.example.tuttorial4

fun String.reverseWords(): String {
    return this.split(" ").reversed().joinToString(" ")
}

fun main() {
    val phrase = "Bonjour Mohamed Mezziane"
    println(phrase.reverseWords())  // "tous à Bonjour"
}