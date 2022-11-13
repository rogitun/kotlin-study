package chap_4.sec3

import java.util.*

//infix

infix fun Int.multiply(x:Int) : Int {
    return this * x
}

infix fun String.appendLast(x : String) : String {
    return this.plus(x)
}

fun fibo(number : Int) : Int {
    if(number <= 1) return 1
    return number * fibo(number-1)
}


var arr = Array(10,{0})

fun fibo2(number : Int) : Int {
    if(number <= 1) {
        return number
    }
    if(arr[number]!=0) {
        return arr[number]
    }
    arr[number] = fibo2(number-1) + fibo2(number-2)

    return arr[number]
}

fun main() {
    val number = 10

    //일반 표현법
    val multi = number.multiply(3)

    //중위 표현법
    val multi2 = 10 multiply 3

    println("mul1 = $multi, mul2 = $multi2")

    val res = "hansel" appendLast "Hwang"
    println(res)

    val fibo = fibo(5)
    println(fibo)

//    arr[0] = 1
    arr[1] = 1
    arr[2] = 1
    val fibo2 = fibo2(7)
    println(fibo2)

//    for(i in arr){
//        println(i)
//    }

}

