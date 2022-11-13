package chap_5.c5_1

fun main() {
//    val one = 5
//    var res = if(one > 10) 9 else -9
//
//    println(res)
//
//    val a = 10
//    var max = if(a > 5){
//        println("10 > 5")
//        a
//    }else{
//        5
//    }


    val input = readLine()!!.toInt()

    val res = if(input in 90..100) "A"
    else if(input in 80..89) "B"
    else "C"

    println(res)





}