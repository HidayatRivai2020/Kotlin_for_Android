package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    var car = TheCar("BMW")
    car.year = 2020
    car.getDescription()
    println("the car is ${car.checkAge()}")
}

abstract class AbstractVehicle {
    abstract var name:String
    var year:Int = 0

    abstract fun getDescription()
    fun checkAge() : Int {
        return 2023 - this.year
    }
}


class TheCar(override var name: String) : AbstractVehicle() {
    override fun getDescription() {
        println("$name ($year)")
    }

}