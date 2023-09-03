package com.example.learnkotlin.oop

fun main(args: Array<String>) {
    var car = Cars("BMW", 1998)
}

class Cars constructor(name: String, model: Int) {
    init {
        println("My car is $name with model $model")
    }
}