package com.example.learnkotlin.variables

fun main(args: Array<String>) {
    println("name:String? = readLine() --> input here")
    var name:String? = readLine()
    println("read line : $name")

    println("")
    println("name:String = readLine()!! --> input here")
    var name2:String = readLine()!!
    println("read line 2 : $name2")

    println("")
    println("name:String = readLine()!!.toInt() --> input Integer here")
    var name3:Int = readLine()!!.toInt()
    println("read line 3 : $name3")

    println(3+5*2%5-4)
}