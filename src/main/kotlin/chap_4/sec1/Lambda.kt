package chap_4.sec1

fun main() {
    val result: Int
    val multi = { a: Int, b: Int ->
        println("a $a , b $b")
        a * b
    }
    val multi2: (a: Int, b: Int) -> Int = { a, b -> a * b }


    val res = multi(2, 3)

    println(res)


    val realGreet: () -> Unit = {
        println("Hello")
    }
    val greet = { println("Hello") }

    greet()

    val sqrt: (Int) -> Int = { x -> x * x }
    val sqrt2 = {x : Int -> x * x }

    val resultSquare = sqrt2(5)

    println(resultSquare)

    val nestedLambda: () -> () -> Unit = { { println("Hello") } }


}