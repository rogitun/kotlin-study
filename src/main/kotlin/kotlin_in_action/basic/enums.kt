package kotlin_in_action.basic

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO
}

fun main(){
    println("the colors that i have : ${Color.values().joinToString()}")
}