package chap_3.chap_3_3

var c = Math.random().toInt()

fun notPure(a : Int, b : Int) : Int{
    return a + b + c
}

fun pure(a : Int, b : Int) : Int{
    return a + b
}

fun highFunc(sum : (Int,Int)->Int, a : Int, b : Int) : Int = sum(a,b)


fun main() {
    var a = pure(1,2)

    var sum = {x : Int ,y : Int -> x + y}


    val res = sum(5,3)

    println(res)

    val res2 = highFunc({x,y -> x + y}, 5, 11)

    println(res2)
}