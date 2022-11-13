<h1>중위 표현법</h1>

infix notation

클래스 멤버 호출 시 사용하는 점(.)을 생략하고 함수 이름 뒤에 
소괄호를 생략해 직관적인 이름을 사용할 수 있는 표현법

> 조건
 - 멤버 메서드 또는 확장 함수여야한다.
 - 하나의 매개변수를 가져야한다,.
 - infix 키워드를 사용한다.

```aidl
infix fun Int.multiply(x:Int) : Int {
    return this * x
}

fun main() {
    val number = 10

    //일반 표현법
    val multi = number.multiply(3)

    //중위 표현법
    val multi2 = 10 multiply 3

    println("mul1 = $multi, mul2 = $multi2")
}
```

> 코틀린 재귀함수