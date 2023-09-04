package com.example.learnkotlin.native_kotlin.operations

fun main(args: Array<String>) {
    var result = 5 + 3 * 10
    println("5 + 3 * 10 = $result")

    result = (5 + 3) * 10
    println("(5 + 3) * 10 = $result")

    var x = 8
    var y = 3
    var z = 4
    var total = 0

    total = x + --y * ++z
    println("8 + --3 * ++4 = $total")
}