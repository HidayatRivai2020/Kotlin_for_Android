package com.example.learnkotlin.native_kotlin.collections

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    age.add(10)
    age.add(15)
    age.add(5)
    age.add(1, 7)

    println("----------------Print ArrayList using []----------------")
    for (index in age.indices) {
        println("ArrayList at index $index has element ${age[index]}")
    }

    var cars = arrayListOf<Any>("BMW", "VW", "Mercedes", "Ferrari", 123)

    println("----------------Print ArrayList using get(index)----------------")
    for (index in cars.indices) {
        println("ArrayList at index $index has element ${cars.get(index)}")
    }

    cars.add('a')
    cars.add(false)
    cars.add(2.5)
    cars.add('a')
    cars.remove("VW")
    cars.removeAt(0)

    println("----------------Print ArrayList with Any Type----------------")
    for (index in cars.indices) {
        println("ArrayList at index $index has element ${cars.get(index)}")
    }
    println("size = ${cars.size}")
    println("first = ${cars.first()}")
    println("last = ${cars.last()}")

}