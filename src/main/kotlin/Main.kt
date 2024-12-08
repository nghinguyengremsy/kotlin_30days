package org.example

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.buffer
import org.example.examples.*
import kotlinx.coroutines.channels.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main () = runBlocking<Unit> {
        val job = launch {
        try {
            repeat(5) { i ->
                println("Processing $i")
                delay(500L)
                if (i == 3) throw RuntimeException("Something went wrong!")
            }
        } catch (e: Exception) {
            println("Caught exception: ${e.message}")
        }
    }
    job.join()
}
