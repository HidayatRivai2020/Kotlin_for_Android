package com.example.learnkotlin.functions

fun main(args: Array<String>) {
    greetings()
    showMyName("Jack")

    greetings()
    showMyName("Night")
}

// No Parameter
fun greetings() {
    println("Hello guys")
}

// With Parameter
fun showMyName(name:String) {
    println("my name is : $name")
}