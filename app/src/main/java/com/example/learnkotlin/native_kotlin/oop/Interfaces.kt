package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    var robot = Robot()
    robot.speed = "1000 km/h"
    robot.walk()
    robot.fly()
    robot.show()
    robot.showId("Captain")
}

class Robot : CanGo, ShowId {
    override val type: String
        get() = "0-124XY"
    override var speed: String = ""

    override fun fly() {
        println("Robot can fly at $speed")
    }

    override fun showId(receiver: String) {
        println("Hi $receiver, this is my id : $type")
    }

}

interface CanGo {
    fun walk() {
        println("Robot can walk")
    }
    abstract fun fly()

    val speed: String
}


interface ShowId {
    fun show() {
        println("ID : $type")
    }
    abstract fun showId(receiver: String)

    val type: String
}