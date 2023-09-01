package com.example.learnkotlin.collections

fun main(args: Array<String>) {
    // Immutable
    var players = mapOf<Int, String>(
        94 to "Jack",
        20 to "Stu",
        34 to "Joker",
        25 to "HDRV",
    )

    println("----------------Immutable Map Of----------------")
    for (player in players) {
        println("player with number ${player.key} = ${player.value}")
    }
    println("Player number 94 is ${players[94]}")

    // Mutable
    var names = mutableMapOf<Int, String>(
        94 to "Karen",
        20 to "Elli",
        34 to "Mary",
        25 to "Popuri"
    )
    names.put(23, "Ann")
    println("----------------Mutable Map Of----------------")
    for (name in names) {
        println("player with number ${name.key} = ${name.value}")
    }
    println("Player number 23 is ${names[23]}")
}