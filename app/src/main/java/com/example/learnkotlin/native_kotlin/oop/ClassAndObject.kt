package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    var emptyObject = EmptyClass()
    var methodPropertyClass = MethodPropertyClass()
    println(methodPropertyClass.myProperty)
    methodPropertyClass.myMethod()
}

class EmptyClass() {
}

class MethodPropertyClass() {
    var myProperty = "this is a property"

    fun myMethod() {
        println("this is a method")
    }
}