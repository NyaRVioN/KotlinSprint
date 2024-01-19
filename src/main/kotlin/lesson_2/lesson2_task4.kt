package org.example.lesson_2

fun main() {

    val crystalOre = 7.0
    val ironOre = 11.0
    val buff = 20
    val percents = 100

    val bonusCrystalOre = ((crystalOre / percents) * buff).toInt()
    val bonusIronOre = ((ironOre / percents) * buff).toInt()

    println(bonusCrystalOre)
    println(bonusIronOre)

}