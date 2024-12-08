package org.example.examples

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/// A coroutine allows code to run concurrently without blocking the thread. The launch function is used to start a new coroutine.

suspend fun helloCoroutine() = coroutineScope {
    launch {
        delay(1000)
        println("Coroutine!")
    }

    println("Hello,")
}

/// async is used for concurrent computations. It returns a Deferred object, which you can await to get the result.
suspend fun computeAnswer() = coroutineScope {
    val a = async {
        println("I'm computing part of the answer")
        delay(1000L)
        6
    }

    val b = async {
        println("I'm computing another part of the answer")
        delay(1000L)

        7
    }

    println("The answer is ${a.await() * b.await()}")
}

/// withContext allows you to change the coroutine context, such as moving computation to a background thread.

//fun main() = runBlocking {
//    println("Running on: ${Thread.currentThread().name}")
//
//    val result = withContext(Dispatchers.Default) {
//        heavyComputation()
//    }
//
//    println("Result: $result on ${Thread.currentThread().name}")
//}

suspend fun heavyComputation(): Int {
    delay(1000L) // Simulate heavy work
    println("Computing on: ${Thread.currentThread().name}")
    return 42
}

/// coroutineScope ensures that child coroutines run in a structured way and are properly canceled if their parent is canceled.

//fun main() = runBlocking {
//    coroutineScope {
//        launch {
//            delay(1000L)
//            println("Task 1 completed!")
//        }
//        launch {
//            delay(2000L)
//            println("Task 2 completed!")
//        }
//    }
//    println("All tasks completed!")
//}

/// withTimeout cancels a coroutine if it exceeds the specified time.

//fun main() = runBlocking {
//    try {
//        withTimeout(1500L) {
//            repeat(10) { i ->
//                println("Processing $i")
//                delay(500L)
//            }
//        }
//    } catch (e: TimeoutCancellationException) {
//        println("Timed out!")
//    }
//}

/// Channels provide a way to send and receive data between coroutines.

//fun main() = runBlocking {
//    val channel = Channel<Int>()
//
//    launch {
//        for (x in 1..5) {
//            channel.send(x * x) // Send squared values
//        }
//        channel.close() // Close channel after sending
//    }
//
//    for (value in channel) {
//        println("Received: $value") // Receive and print values
//    }
//}

/// Handle exceptions using try-catch or a custom CoroutineExceptionHandler.

//fun main() = runBlocking {
//    val job = launch {
//        try {
//            repeat(5) { i ->
//                println("Processing $i")
//                delay(500L)
//                if (i == 3) throw RuntimeException("Something went wrong!")
//            }
//        } catch (e: Exception) {
//            println("Caught exception: ${e.message}")
//        }
//    }
//    job.join()
//}

/// Flow
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}