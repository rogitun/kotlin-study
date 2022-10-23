package chap_3

fun highFunc(sum : (Int, Int)-> Int, a : Int, b: Int) : Int {
    return sum(a,b)
}

fun main() {

    println(highFunc({x,y -> x + y},5,5))
    println(highFunc({x,y -> x - y},5,2))
    println(highFunc({x,y -> x * y},5,5))

}