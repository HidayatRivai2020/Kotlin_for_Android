package com.example.learnkotlin.native_kotlin.oop

fun main(args: Array<String>) {
    println("------------ Super Class ------------")
    var film = Film()
    film.title = "Ultimatum"
    film.year = 2001
    println(film.getDescription())

    println("------------ Sub Class ------------")
    var drama = Drama()
    drama.title = "Green"
    drama.year = 2010
    drama.episode = 16
    println(drama.getDescription())
    println(drama.getSuperDesc())
}

open class Film {
    var title:String? = null
    var year:Int? = null

    open fun getDescription() : String{
        return "$title ($year)"
    }

}

open class Drama : Film() {

    var episode:Int? = null

    override fun getDescription() : String {
        return "$title ($year) - $episode episodes"
    }

    fun getSuperDesc() : String {
        return super.getDescription()
    }

}