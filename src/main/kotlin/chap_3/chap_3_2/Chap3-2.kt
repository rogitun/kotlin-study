package chap_3.chap_3_2


fun sumThree(a : Int, b : Int = 5, c : Int) = a + b + c

fun variables(vararg numbers:Int){
    for(num in numbers){
        println(num)
    }
}

fun main() {
    sum(1)
    sumThree(1,c = 9)
    sumThree(a = 5,c = 10)

    for(i in 0..9){

    }

    variables(1,2,34,5,6,7)
}

fun sum(a : Int, b : Int = 5) = a + b