package com.example.learnkotlin.oop

fun main(args: Array<String>) {
    var newClass = NewClass()
    newClass.callPrivate()
    newClass.callProtected()
    println(newClass.z)
}

class NewClass() {
    private var x = "this is private property"
    protected var y = "this is protected property"
    public var z = "this is public property"

    fun callPrivate() {
        println(this.x)
    }

    fun callProtected() {
        println(this.y)
    }

}