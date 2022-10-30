package chap_1

fun main() {

    //이중 등호와 삼중 등호

    //이중 등호는 값만 비교하며
    //삼중 등호는 값과 참조 주소를 비교한다.
    val a : Int = 19976
    val b : Int? = 19976 //널이 가능한 정수형, 이 타입은 객체타입이 되어 힙 영역,
    val c : Int? = 19976

    println(b === c)
    println(a === b)

    println("########################")

//    println(num is Float);
//    println(num is Int);

//    println(num is Double)

//    println(num is Short)


// println("Any타입")
//    //자료형이 정해지지 않은 경우
//    //모든 클래스의 뿌리, Int String 등은 Any형의 자식 클래스이다.
//    //Any는 언제든 필요한 자료형으로 자동 변환이 된다.
//
//    var imAny : Any = 125
//
//    println(imAny.javaClass)
//
//    imAny = "Hansel"
//
//    println(imAny.javaClass)
//
//    imAny = 'C'
//
//    println(imAny.javaClass)


    var p1 : Person = Person("ABC",42)
    var p2 : Person = Person("ABC",22)

    println(p1==p2)

}

data class Person(
    var name : String,
    var age : Int
)