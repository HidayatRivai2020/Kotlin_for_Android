package com.example.learnkotlin.native_kotlin.collections

fun main(args: Array<String>) {
    var cars = setOf<Any>("BMW", "VW", 123, true, 'a',"Mercedes", "Ferrari", 123)

    println("----------------Print ArrayList using elementAt(index)----------------")
    for (index in cars.indices) {
        println("Set at index $index has element ${cars.elementAt(index)}")
    }

    println("size = ${cars.size}")
    println("first = ${cars.first()}")
    println("last = ${cars.last()}")
}