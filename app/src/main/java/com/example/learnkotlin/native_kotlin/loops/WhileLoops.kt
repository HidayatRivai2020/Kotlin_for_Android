package com.example.learnkotlin.native_kotlin.loops

fun main(args: Array<String>) {
    var i = 5
    println("-------------- While --------------")
    while (i < 10) {
        println(i)
        i++
    }

    println("-------------- break --------------")
    var a = 10
    while (a > 0) {
        println(i)
        if (a == 5) {
            break
        }
        println(a)
        a--
    }

    println("-------------- continue --------------")
    a = 10
    while (a > 0) {
        println(i)
        if (a == 5) {
            continue
        }
        a--
    }
}