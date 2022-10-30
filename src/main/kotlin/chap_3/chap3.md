<h1>함수의 선언</h1>

코틀린에서는 fun 키워드를 통해 함수를 선언합니다.

**함수 형태**

```aidl
fun 함수명(파라미터 : 타입) : 반환타입 {
    함수 실행부
}
```

**코틀린 함수의 특징** 

- fun 키워드
- 파라미터가 있을 경우, 파라미터 타입 명시
- 반환되는 값이 있을 경우 반환 타입 명시
- 반환타입은 특정 경우 생략이 가능
- 자바와 달리 Class 내부에 함수를 선언하지 않아도 됨

```aidl
일반적인 함수 모습
fun function(number : Int) : Int {
    return number
}
Unit 타입의 함수
fun function2(){
    println("Function")
}
```
함수의 정의부에 사용되는 변수들은 **매개변수(파라미터)** 라고 부르며,\
함수를 사용할 때 사용하는 변수 및 값은 **'인자'** 라고 부릅니다.

<hr>

**Unit?**

특정 자료형을 반환하지 않는다면, 함수의 반환 타입은 생략될 수 있습니다.\
이 경우 Unit 타입이 사용되는데 자바의 void와 유사한 개념입니다.

하지만 void와 달리 Unit은 타입의 인자로 쓸 수 있습니다.\
따라서 제네릭 파라미터를 반환하는 함수를 오버라이드 했을 때\
유연하게 처리할 수 있습니다.

```aidl
interface Processor<T> {
    fun process() : T
}

class NoResult : Processor<Unit> {
    override fun process() {
        println("No Return")
    }
}
```

<hr>

**간략화**

```aidl
fun trick(number:Short, number2: Float) : Float{
    return number + number2
}

fun trick(number:Short, number2: Float) = number + number2
```

컴파일러가 함수 본문의 식을 분석해 식의 결과 타입을 함수 반환 타입으로 정해줍니다.

<hr> 

**최상위 함수(Top level function)**


자바에서는 항상 클래스 내에 함수를 정의했지만, 코틀린은 class 없이 함수를 정의할 수 있다.\
이러한 함수들을 최상위 함수라 부르며, 위치에 상관 없이 호출할 수 있다.

**로컬 함수(Local Function)**

함수 안에 또 다른 함수를 정의해 사용하는 것을 로컬 함수라고 합니다.\
로컬 함수를 호출하는 부분은 로컬 함수의 정의부보다 아래에 위치해야 합니다.

```aidl
fun local(){
    localLocal() //불가능
    fun localLocal(){
        println("Local Local")
    }
    localLocal()// 가능
}
```

로컬 함수는 로컬 함수 상위 바깥 함수의 모든 파라미터 및 변수를 사용할 수 있습니다.\
이러한 형질을 이용하여 코드를 간결하게 작성하면서 중복을 제거할 수 있습니다.

```aidl
중복되는 코드
fun saveUser(user : User){
    if(user.address.isEmpty()){
        throw...
    }
    if(user.name.isEmpty()){
        throw...
    }

    insert(user)
}

로컬 함수로 중복을 제거한 코드
fun saveUser(user : User){
    fun validate(input : String){
        if(input.isEmpty()){
            throw...
        }
    }
    validate(user.name)
    validate(user.address)
    insert(user)
}
```

<h1>함수 호출 및 선언 2</h1>

**매개변수의 기본 값**

코틀린에서는 함수 매개변수에 기본 값을 설정할 수 있습니다.

```aidl
fun sum(a : Int, b : Int = 5) = a + b

fun sum2(a : Int, b : Int = 5, c : Int) = a + b + c

fun main() {
    sum(1)
    
    sum2(1,2) ???
    -> 2가 b인지 c인지 모른다.
    -> sum2(a = 1, c = 5)
}
```

**가변 인자**

함수의 인자 타입은 동일하지만 수가 가변적인 경우엔 가변 인자를 가진 함수를 정의할 수 있습니다.


```aidl
fun variables(vararg numbers:Int){
    for(num in numbers){
        println(num)
    }
}
```

<hr>

**함수와 스택 프레임**

스택
- 임시적으로 쓰는 공간
- 높은 주소에서 낮은 주소로

힙 
- 동적으로 할당되는 공간
- 낮은 주소에서 높은 주소로

![](../../../../../../../../../var/folders/9s/f15_lrkj6gz69n360wp5np0r0000gn/T/TemporaryItems/NSIRD_screencaptureui_rXcSFr/스크린샷 2022-10-30 오후 7.48.15.png)

![](../../../../../../../../../var/folders/9s/f15_lrkj6gz69n360wp5np0r0000gn/T/TemporaryItems/NSIRD_screencaptureui_KJfGcx/스크린샷 2022-10-30 오후 7.47.49.png)

1. main 함수의 프레임이 생성되어 스택 메모리에 push
2. 지역 변수들이 해당 프레임에 저장
3. max 함수 호출, 스택 메모리에 push
4. a, b가 max 함수 프레임에 저장
5. 연산 완료되고 차례대로 pop

<h2>예제</h2>
```
fun avgFunc(initial: Float, vararg numbers: Float): Double {
    var result = 0f
    
    for (num in numbers) {
        result += num
    }
    
    println("result: $result, numbers.size: ${numbers.size}")
    
    val avg = result / numbers.size
    return (avg+initial).toDouble()
}
```
<hr>
<h1>함수형 프로그래밍</h1>

코틀린은 다중 패러다임 언어
- 함수형 프로그래밍
- 객체 지향 프로그래밍

함수평 프로그래밍이란
- 코드가 간략하고 테스트나 재사용성 증가
- 람다식, 고차 함수를 사용해 구성
- 순수 함수
- 변수 뿐만 아니라 함수를 인자로 전달할 수 있다.

<hr>

**순수 함수**

- 부작용이 없는 함수
- 동일한 입력 인자에 대해서는 항상 같은 결과를 출력 혹은 반환한다.
- 값을 예측할 수 있다.

```aidl
var c = Math.random().toInt()

fun notPure(a : Int, b : Int) : Int{
    return a + b + c
} -> 순수 함수가 아니다.

fun pure(a : Int, b : Int) : Int{
    return a + b
} -> 순수 함수
```

**순수 함수가 아닌 함수**

- 외부 인자에 의해 값이 변경되는 경우
- 함수 외부의 상태를 변경시키는 경우

**순수함수를 사용하는 이유?**

- 입력과 내용을 분리하고 모듈화가 가능해 재사용성이 높아진다. 
- 여러가지 함수들과 조합해도 부작용이 없다. (결과 예측이 가능)
- 특정 상태에 영향을 주지 않아 병행 작업 시 안전
- 테스트나 디버깅 등이 유리하다.

**함수형 프로그래밍에 적용?**

- 함수를 매개변수, 인자 혹은 반환 값으로 사용할 수 있다.
- 함수를 변수나 데이터 구조에 저장할 수 있다.
- 유연성이 증가한다.

```aidl
fun abc()...

val function = abc()
```

<hr>

**람다식**

```aidl
var sum = {x : Int ,y : Int -> x + y}
```

- 익명 함수의 하나의 형태로 이름 없이 사용 및 실행이 가능하다
- 고차 함수에서 인자로 넘기거나 결과 값으로 반환을 할 수 있다.

<hr>

**일급 객체(First Class Citizen)**

- 일급 객체는 함수의 인자로 전달할 수 있다.
- 일급 객체는 함수의 반환값에 사용할 수 있다.
- 일급 객체는 변수에 담을 수 있다.

**코틀린에서 함수는 1급 객체로 다룹니다.**


<hr>

**고차 함수**

함수를 인자로 넘기거나 반환할 수 있을 때 그 함수를 **일급 객체**로 취급하고\
함수를 인자로 받거나 결과로 반환하는 함수를 고차함수라고 합니다.

```aidl
함수를 매개변수로 받으면서, 결과로 함수를 반환하는 고차함수의 예
fun highFunc(sum : (Int,Int)->Int, a : Int, b : Int) : Int = sum(a,b)

fun main(){
    val res2 = highFunc({x,y -> x + y}, 5, 11)
}
```

고차 함수의 람다식은 마지막에 작성해주는 것이 좋습니다.\
아래와 같이 람다식을 괄호 밖으로 빼내어 사용할 수 있습니다.

```aidl
함수를 매개변수로 받으면서, 결과로 함수를 반환하는 고차함수의 예
fun highFunc(a : Int, b : Int,sum : (Int,Int)->Int) : Int = sum(a,b)

fun main(){
    val res2 = highFunc(5, 11) {x,y -> x + y} 
}
```

**함수형 프로그래밍의 필요성**

- 프로그램의 모듈화로 디버깅이나 테스트가 쉽다.
- 간략한 표현식을 통해 생산성 향상
- 람다식과 고차함수를 통해 다양한 함수 조합을 사용할 수 있다.

**정리**

- 함수평 프로그래밍은 순수 함수를 조합해 상태 데이터 변경이나 부작용이 없는 루틴을 만들어 낸다.
- 람다식을 통해 함수를 변수처럼 매개변수, 인자, 반환 값 등에 활용하는 고차 함수를 구성해 생산성 향상이 가능하다.