package com.example.learnkotlin.native_kotlin.control_flow

fun main(args: Array<String>) {
    println("Please Enter a Number")
    var number = readLine()!!.toInt()

    if (number < 10) {
        println("number under 10")
    }

    if (number % 2 == 0) {
        println("$number is even number")
    } else {
        println("$number is odd number")
    }

    if (number < 4) {
        println("you failed")
    } else if (number < 10) {
        println("you passed")
    } else {
        println("invalid value")
    }

    if (number < 4) {
        if (number % 2 == 0) {
            println("restart in the A class")
        } else {
            println("restart in the B class")
        }
    } else {
        if (number % 2 == 0) {
            println("continue to C class")
        } else {
            println("continue to D class")
        }
    }
}