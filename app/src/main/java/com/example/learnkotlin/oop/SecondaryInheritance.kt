package com.example.learnkotlin.oop

fun main(args: Array<String>) {
    var doll = Doll("Barbie", 1000)
    doll.showPrice()
    doll.showType()

    var doll2 = Doll("Andy", 1000, 4)
    doll2.showPrice()
    doll2.showType()
}

open class Toys {
    var name:String? = null
    var price:Int? = null
    constructor()
    constructor(name: String, price:Int) {
        this.name = name
        this.price = price
    }

    fun showPrice() {
        println("${this.name} is ${this.price}")
    }
}

class Doll : Toys {
    var type:Int = 0

    constructor(name: String, price:Int) {
        this.name = name
        this.price = price
    }

    constructor(name: String, price:Int, type:Int) {
        this.name = name
        this.price = price
        this.type = type
    }

    fun showType() {
        println("${this.name} is ${this.type}")
    }

}