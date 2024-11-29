package com.example.a5first_android_app

fun main() {
    println(birthdayGreeting("Mohamed", 23))
}

// multiple parameter
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}