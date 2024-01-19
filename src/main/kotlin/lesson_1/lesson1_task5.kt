package org.example.lesson_1

fun main() {

    val secondsInMinutes = 60
    val minutesInHour = 60

    val seconds = 6480
    val minutes = seconds / secondsInMinutes
    val hours = minutes / minutesInHour

    val remainingSeconds = seconds % secondsInMinutes
    val remainingMinutes = minutes % minutesInHour

    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)
    println(formattedTime)


}
