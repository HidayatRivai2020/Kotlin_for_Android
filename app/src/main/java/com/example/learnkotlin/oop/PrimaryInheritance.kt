package com.example.learnkotlin.oop

fun main(args: Array<String>) {
    var farmer = Farmer("josh", "Male")
    farmer.name = "Josh"
    farmer.convertGender()
    farmer.sayHello()
}

open class Person(name: String, gender: String) {

    init {
        println("init from superclass")
    }

    public var name:String? = name
    protected var gender:String? = gender

    fun showPublic() {
        println("This is public method from Person class")
    }

    protected fun showProtected() {
        println("This is protected method from Person class")
    }
}

class Farmer(name: String, gender: String) : Person(name, gender) {

    fun sayHello() {
        println("hello, my name is $name, I am a $gender")
    }

    fun convertGender() {
        if (gender == "Male") {
            gender = "Man"
        } else if (gender == "Female"){
            gender = "Woman"
        }
    }
}