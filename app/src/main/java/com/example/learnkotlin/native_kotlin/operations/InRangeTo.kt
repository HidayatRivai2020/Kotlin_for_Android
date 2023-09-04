package com.example.learnkotlin.native_kotlin.operations

fun main(args: Array<String>) {
    println("-------------- 1..5 --------------")
    for (a in 1..5) {
        println(a)
    }

    println("-------------- a.RangeTo(g) --------------")
    for (a in 'a'.rangeTo('g')) {
        println(a)
    }

    println("-------------- char in range --------------")
    var myRange = 'a'.rangeTo('g')
    var myChar = 'c' in myRange
    println(myChar)

}