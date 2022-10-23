package chap_1

fun main() {

    //이중 등호와 삼중 등호

    //이중 등호는 값만 비교하며
    //삼중 등호는 값과 참조 주소를 비교한다.

    val temp : Int = 19976
    val a : Int? = 19976
    val b : Int? = 19976 //널이 가능한 정수형, 이 타입은 객체타입이 되어 힙 영역,
//
//    println(a==b)
//    println(a===b)


    println("########################")


    var num : Number = 12.5F;

//    println(num is Float);

    num = 12;

//    println(num is Int);

    num = 12.2222222222222222222222222222

//    println(num is Double)

//    println(num is Short)


 println("Any타입")
    //자료형이 정해지지 않은 경우
    //모든 클래스의 뿌리, Int String 등은 Any형의 자식 클래스이다.
    //Any는 언제든 필요한 자료형으로 자동 변환이 된다.

    var imAny : Any = 125

    println(imAny.javaClass)

    imAny = "Hansel"

    println(imAny.javaClass)

    imAny = 'C'

    println(imAny.javaClass)



}