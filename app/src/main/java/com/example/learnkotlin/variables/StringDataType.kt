package com.example.learnkotlin.variables

fun main(args: Array<String>) {
    var a = "Hello Kotlin"
    var b = "Language"
    println(a)
    println(a[5])
    println(a + b)
    println(a + " " + b)

    println("$a $b")
    println("${a.length} ${b.length}")

    var age = 20
    println("The age is " + age)
}