<h1>람다</h1>

아래와 같은 방식으로 변수에 람다식을 할당할 수 있다.
```aidl
    val multi = { a: Int, b: Int -> a * b }
    val multi2 : (a : Int, b:Int) -> Int = { a , b -> a * b }
```

1번 방식으로 타입을 지정해주는 방식이 있고, \
2번 방식과 같이 미리 선언해주고 람다 식에 할당해주는 방법도 있다.

위 변수 multi, multi2 에는 람다 식이 들어간다.

호출은 multi(int,int) 방식으로 호출해주면 된다.

> 표현식이 2줄 이상인 경우

```aidl
    val multi = { a: Int, b: Int ->
        println("a $a , b $b")
        a * b
    }
```

마지막 표현식(a*b)이 반환된다.

> 반환 자료형이 없는 경우

```aidl

    val realGreet : () -> Unit = {
        println("Hello")
    }
    val greet = { println("Hello") }
```

Unit형으로 지정되어 생략할 수 있다.

위 두 변수(람다)는 같다.

> 매개변수가 하나 있는 경우

```aidl
    val sqrt : (Int)-> Int = {x -> x * x}
    val sqrt2 = {x : Int -> x * x }
```

1번, 2번 방식으로 표현할 수 있음.





