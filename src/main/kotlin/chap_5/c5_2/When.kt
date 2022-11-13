package chap_5.c5_2

import java.lang.Integer.parseInt

fun main() {
    val input = readLine()!!.toInt()


    val res = when(input){
        200 -> "GREAT"
        300,400 -> "AWESOME"
        parseInt("500") -> "Wow"
        in 90..100 -> "A"
        in 80..90 -> "B"
        else -> "C"
    }

    println(res)
}