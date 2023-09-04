package com.example.learnkotlin.native_kotlin.functions

fun main(args: Array<String>) {
    var rand = getRandom()
    println("random number: $rand")

    var rand2 = doubleIt(rand)
    println("double it: $rand2")
}

// no parameter
fun getRandom(): Int {
    return (0..10).random()
}

// with parameter
fun doubleIt(number: Int): Int {
    return number * 2
}