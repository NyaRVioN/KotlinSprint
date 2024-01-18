package org.example.lesson_1
fun main() {
    val seconds = 6480

    val minutes = seconds /60
    val hours = minutes /60

    val remainingSeconds = seconds % 60
    val remainingMinutes = minutes % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)
    println(formattedTime)


}
