package kotlin_in_action.basic

import kotlin.text.StringBuilder

fun alphabet1(): String {
    val result = StringBuilder()
    for (x in 'a'..'z') {
        result.append(x)
    }
    result.append("\n all the alphabets here")
    return result.toString()
}

fun alphaWithWith(): String {
    val res = StringBuilder()
    return with(res) {
        for (x in 'a'..'z') {
            append(x)
        }
        append("\n all the alphabets here")
        toString()
    }
}

val alphaWithApply = StringBuilder().apply {
    for (vl in 'a'..'z') {
        append(vl)
    }
    append("\n all the alphabets here")
}.toString()

fun building() = buildString {
    for (x in 'a'..'z') {
        append(x)
    }
}


fun main() {
    println(alphabet1())
    println(alphaWithWith())
    println(alphaWithApply)

}
