package chap_5.c5_4

fun main() {
    //return, break, continue
    abc()
}

fun lambdaCall(a: Int, b: Int, fung: (Int, Int) -> String): String {
    return fung(a, b);
}

fun abc() {
    println("start")

    val res = lambdaCall(5, 10) { x, y ->
        println("Function CAll")

        x.toString() + y.toString()
    }

    println(res);
}