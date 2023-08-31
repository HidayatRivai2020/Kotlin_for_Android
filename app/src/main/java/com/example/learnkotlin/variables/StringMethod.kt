package com.example.learnkotlin.variables

fun main(args: Array<String>) {
    var x = "Kotlin"
    var y = " Language "
    println("the length of x : " + x.length)

    println(x.equals("Java"))
    println(x.equals("kotlin"))
    println(x.equals("Kotlin"))
    println(x.isEmpty())
    println(x.plus(y))
    println(x.plus(" Language"))
    println(x.lowercase())
    println(x.uppercase())
    println(y)
    println(y.trim())

    println(x)
    println(y)

}