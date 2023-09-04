package com.example.learnkotlin.native_kotlin.variables

fun main(args: Array<String>) {
    var x:Byte = 100
    println(x.toShort())
    println(x.toInt())
    println(x.toLong())
    println(x.toFloat())
    println(x.toDouble())
    println(x.toString())

    var y = 3
    println(y.toByte())
    println(y.toChar())

    var isCorrect = "true"
    println(isCorrect.toBoolean())

}