package chap_4.sec2

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int): Int = a * b

fun mulLambda(lamSum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return lamSum(a, b)
}

fun funcFunc(a: Int, b: Int): Int {
    return sum(a, b)
}


fun main() {

    val res = sum(10, 10) //20
    val res2 = mul(sum(10, 5), 10)
    val res2Lambda = mulLambda({ x, y -> x + y }, 10, 5)
    val res3 = funcFunc(2, 3)

    println("res1 : $res \nres2 : $res2 \nres3 : $res3")


    val result = callByValue(lambda())
    
    println("#####################")
    
    val result2 = callByName(lambda)
}

fun callByValue(b : Boolean ): Boolean {
    println("CallByValue Call")
    return b
}

val lambda : ()-> Boolean = {
    println("Lambda Call")
    true
}

fun callByName(b : () -> Boolean) : Boolean {
    println("CallByName call")
    return b() // b 함수가 호출되는 시점에 람다식 호출.
}
