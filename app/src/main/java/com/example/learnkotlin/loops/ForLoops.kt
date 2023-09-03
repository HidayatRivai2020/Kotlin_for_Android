package com.example.learnkotlin.loops

fun main(args: Array<String>) {
    println("-------------- 1..10 --------------")
    for (i in 1..10) {
        println(i)
    }

    var arr = arrayOf(1, 9, 2, 10, 6, 8)
    println("-------------- Arrays --------------")
    for (i in arr) {
        println(i)
    }

    println("-------------- Arrays for each --------------")
    arr.forEach { println(it) }

    println("-------------- break --------------")
    for (i in arr) {
        println(i)
        if (i == 2) {
            break
        }
    }

    println("-------------- continue --------------")
    for (i in arr) {
        if (i % 2 == 1) {
            continue
        }
        println(i)
    }
}