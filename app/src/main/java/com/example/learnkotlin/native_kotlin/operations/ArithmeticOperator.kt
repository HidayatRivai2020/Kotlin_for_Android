package com.example.learnkotlin.native_kotlin.operations

fun main(args: Array<String>) {
    var firstNumber = 20
    var secondNumber = 10

    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber - $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")

    secondNumber = 3
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")
    var result:Double = firstNumber.toDouble() / secondNumber
    println(result)
}