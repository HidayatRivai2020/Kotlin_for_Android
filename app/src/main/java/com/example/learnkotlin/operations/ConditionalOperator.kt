package com.example.learnkotlin.operations

fun main(args: Array<String>) {
    var number1 = 5
    var number2 = 8
    var number3 = 12

    var result = false

    result = number1 < number2 && number2 < number3
    println("$number1 < $number2 && $number2 < $number3 == $result")

    result = number1 < number2 && number2 > number3
    println("$number1 < $number2 && $number2 > $number3 == $result")

    result = number1 < number2 || number2 > number3
    println("$number1 < $number2 || $number2 > $number3 == $result")

    result = number1 > number2 || number2 > number3
    println("$number1 > $number2 || $number2 > $number3 == $result")

}