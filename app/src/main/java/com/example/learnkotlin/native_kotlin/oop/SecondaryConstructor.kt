package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    var car = SecondaryCars("BMW", 1998)
    var car2 = SecondaryCars()
    car2.name = "VW"
    car2.model = 1990

}

class SecondaryCars {
    var name:String? = null
    var model:Int? = null

    constructor()

    constructor(name: String, model: Int) {
        this.name = name
        this.model = model
    }

}