package com.example.tuttorial4

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)  // Simulation d'une opération longue
        println("Hello, Coroutine!")
    }
    println("Processus principal en cours...")
    Thread.sleep(2000L)  // Attendre la fin de la coroutine
}