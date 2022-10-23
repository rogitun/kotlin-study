package chap_3

fun sum(a : Int, b:Int) = a+b

fun sum2(a : Int, b:Int) : Int {
    return a+b
}

fun printMyName(name : String) {
    println("Your name is : $name")
}

fun main() {
    val res = sum(5,3)
    val res2 = sum2(4,4)
    println("sum = $res , sum2 = $res2")
    printMyName("Hansel")
}