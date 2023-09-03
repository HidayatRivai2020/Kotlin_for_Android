package com.example.learnkotlin.functions

fun main(args: Array<String>) {
    greetings("Stu", "Dent")
    luckyNumber()
}

// no parameter
fun luckyNumber() : String {
    var number = (0..10).random()
    return "Your Lucky Number: $number"
}

// with parameter
fun greetings(name1: String, name2: String) : String {
    return "Hello $name1 $name2"
}