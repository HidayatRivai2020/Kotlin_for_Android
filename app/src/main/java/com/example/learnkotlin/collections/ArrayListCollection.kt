package com.example.learnkotlin.collections

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    age.add(10)
    age.add(15)
    age.add(5)
    age.add(1, 7)

    println("---------------------------------------------------------")
    for (index in age.indices) {
        println("ArrayList at index $index has element ${age[index]}")
    }

    var cars = arrayListOf<Any>("BMW", "VW", "Mercedes", "Ferrari", 123)

    println("---------------------------------------------------------")
    for (index in cars.indices) {
        println("ArrayList at index $index has element ${cars.get(index)}")
    }

    cars.add("Ford")
    cars.remove("VW")
    cars.removeAt(0)

    println("---------------------------------------------------------")
    for (index in cars.indices) {
        println("ArrayList at index $index has element ${cars.get(index)}")
    }
}