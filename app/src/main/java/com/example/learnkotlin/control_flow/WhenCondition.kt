package com.example.learnkotlin.control_flow

fun main(args: Array<String>) {
    println("Please enter the number of the week")
    var dayNumber = readLine()!!.toInt()
    var day = ""
    day = when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid"
    }

    println("the day is : $day")


}