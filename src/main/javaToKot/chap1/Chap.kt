package chap1

fun main() {
    var number1 = 10L;
    var number3: Long = 10L; //타입 지정 가능.

    val number2 = 10L;
    // number2 = 2; 불가능.

    //val, var의 차이.

    // 초기값이 필요하면 타입 추론이 가능하도록.
    var number4: Long


    // val collection에는 element를 추가할 수 있다.
    val numberArr: MutableList<Long> = mutableListOf()
    numberArr.add(1234L)

    // nullable
    var nullableN: Long?
    nullableN = null

    // 객체 인스턴스화

    var person = Person("hansel")
}