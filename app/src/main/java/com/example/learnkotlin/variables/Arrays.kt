package com.example.learnkotlin.variables

fun main(args: Array<String>) {
    var age = arrayOf(10, 23, 5, 61, 38, 45, 21)
    println(age.size)

    println("----------------Show The the Values with Integer----------------")
    println(age[0])
    println(age.get(1))

    println("----------------Show The the Values with Loop----------------")
    for (a in age) {
        println(a)
    }

    println("----------------Show The the Values with indices----------------")
    for (a in age.indices) {
        println("index $a is ${age[a]}")
    }

    var cars = arrayOf("Mercedes", "BMW", "Ford")
    println(cars.size)

    println(cars[0])
    cars[0] = "Tesla"
    println(cars[0])

    println("----------------Show array values rangeTo Array Size - 1----------------")
    var carLimit = cars.size-1
    for (a in 0..carLimit ) {
        println("index $a is ${cars[a]}")
    }

    println("----------------Show the values of array from Integer and String Combination----------------")
    var random = arrayOf(3, "Mercedes", 4, "Ford")
    println(random.size)

    println(random[0])
    random[0] = "Tesla"
    println(random[0])

    println(random[1])
    random[0] = 9
    println(random[1])

    println("----------------Show array values until array size----------------")
    var length = random.size
    for (a in 0 until length) {
        println("index $a is ${random[a]}")
    }

    println("----------------Some Method of array----------------")
    var arrPlus = random.plus(age)
    arrPlus = arrPlus.plus("a new string")
    arrPlus.set(9, "an updated String")
    for (a in arrPlus) {
        println(a)
    }

}