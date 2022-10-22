package data_type

fun main() {

    //이중 등호와 삼중 등호

    //이중 등호는 값만 비교하며
    //삼중 등호는 값과 참조 주소를 비교한다.

    val temp : Int = 19976 
    val a : Int? = 19976
    val b : Int? = 19976 //널이 가능한 정수형, 이 타입은 객체타입이 되어 힙 영역,

    println(a==b)
    println(a===b)





}