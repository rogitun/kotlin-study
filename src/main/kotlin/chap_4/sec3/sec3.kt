package chap_4.sec3

val add: (Int, Int) -> Int = fun(x, y) = x + y

var res = add(5, 5)

fun abc(a: Int, b: Int): Int {
    return (a + b)
}

fun shortFunc(){
    println("Hello?!")
}

inline fun shortFunc2(a : Int, out : (Int)->Unit){
    out(a)
}

fun main() {



//    shortFunc();
    shortFunc2(3,{a -> println("a : $a") })

    val add = {x: Int, y : Int -> x + y}

    var re2 = add(5,6)
    println("$res / $re2")
}

