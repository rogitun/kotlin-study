<h1>고차함수의 이해</h1>

특정 함수가 또 다른 함수의 인자가 될 수 있을까?

```aidl
당연히 문제 없다.
    val res2 = mul(sum(10,5),10)
```

<hr> 

> 파라미터에 람다식 

파라미터에 람다식을 사용해 해당 함수 내부에서 사용할 수 있다.
```aidl
fun mulLambda(lamSum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return lamSum(a, b)
}


val res2Lambda = mulLambda({ x, y -> x + y }, 10, 5)

```

<br>

<hr> 

> 람다 함수 call by value

파라미터로 보낸 람다 식은 callByValue 형식으로 호출된다.
```aidl
fun callByValue(b : Boolean ): Boolean {
    println("CallByValue Call")
    return b
}

val lambda : ()-> Boolean = {
    println("Lambda Call")
    true
}

fun main(){
    val result = callByValue(lambda())
}
result = 
Lambda Call
CallByValue Call
```

파라미터로 보낸 lambda 식이 즉시 실행되어 값으로 전달됨.

위 식은 결과를 전달하는 방식이기 때문에 즉시 실행되어 전달된다.

<hr> 

> 람다식 이름을 사용한 호출

이름을 통한 호출은 조금 다르다. <br>
이 경우 파라미터로 람다식 자체가 복사되어 들어간다. 

따라서 return 문에 있는 b 함수가 호출되는 시점에 람다식이 호출되 실행된다.

```aidl
val lambda : ()-> Boolean = {
    println("Lambda Call")
    true
}

fun callByName(b : () -> Boolean) : Boolean {
    println("CallByName call")
    return b() // b 함수가 호출되는 시점에 람다식 호출.
}

fun main(){
    
    val result2 = callByName(lambda)
}
```

위 두 방식의 최종 결과는 같지만 호출 되는 순서가 다르다.


<h1>고차함수와 람다식 이해 2</h1>

<hr> 

> 파라미터가 없는 람다식

```aidl

fun main() {

    noParam({"hi"})
}

fun noParam(out : ()->String) = println(out())

```

언뜻 보면 굉장히 이해하기 어려운 식이다.

noParam 함수는 매개변수로 람다 식을 가지고 있다. \
실행블록에서는 해당 람다 식을 println으로 출력하고 있다.

동작 매커니즘은 다음과 같다.

1. noParam 함수의 매개변수로 람다식 ()->String = {"HI"} 전달
2. ()->String = {"HI"} -> {"HI"} / 매개변수가 없고, 명확한 return 타입으로 인해 축약
3. println("HI")

<hr> 


> 파라미터가 하나인 람다식 

```aidl

fun main() {
    oneParam( { a -> "HI! $a" })
}

fun oneParam(out : (String) -> String){
    println(out("oneParam"))
}
```

이 또한 코틀린, 람다식에 익숙하지 않다면 이해하기 명확하진 않다.

val out : (a2 : String) -> String = { a2 -> "HI $a2"}

하나의 형태로 본다면 이런 형식이라고 할 수 있다.

oneParam의 매개변수에서는 람다식의 형태만 정의하는 것이고 \
그에 대한 구현체는 호출부에 작성되어 있다.

따라서 println 에서 실행되는 형태는 (a2 : String) -> String = { a2 -> "HI $a2"} 형태이다.

<hr> 


> 파라미터 2개 이상

```aidl
fun moreParam(out : (String,String)->String){
    println(out("First","Second"))
}
```

동작 매커니즘은 위의 람다식과 동일하다.

이 경우엔 특이하게 파라미터를 생략해줄수도 있다.

호출부에서 다음과 같이 _를 사용하면 된다

```aidl
moreParam({_, b -> "we just ignored the first param $b"})
```

<hr> 

> 일반 매개변수와 람다식 매개변수의 혼합

```aidl

fun withArgs(a : String, b:String, out: (String,String)->String){
    println(out(a,b))
}

withArgs("I'M", "Hansel") { x, y -> "Hi my introduction => $x $y" }

```

마지막 인자가 람다식인 경우 소괄호 바깥으로 분리가 가능하다.
