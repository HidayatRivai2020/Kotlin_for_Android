package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    var thirdCar = ThirdCars("Ferrari", 1990)
    thirdCar.model = 1992
    println("Car ${thirdCar.name} model has been updated into ${thirdCar.model}")
}

class ThirdCars {
    var name:String? = null
        private set
    var model:Int? = null

    constructor()
    constructor(name:String, model: Int) {
        this.name = name
        this.model = model
    }


}