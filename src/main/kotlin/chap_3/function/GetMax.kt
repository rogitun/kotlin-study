package chap_3.function

fun maxNumber(a : Int, b: Int): Int{
    return if (a>b) a else b
}

fun information(ageList : ArrayList<Int>) : Int {
    return 1;
}

fun defaultParameter(name : String, email : String = "EmptyEmail", age : Int = 25) {
    println("UserName is $name and Email is $email and age is $age")
}

fun normalVarargs(vararg a : Int){
    for(num in a){
        println(num);
    }
}

fun average(first: Float, vararg seconds : Float ): Double{
    var res : Double = first.toDouble();

    var div : Int = 1 + seconds.size

    for(num in seconds){
        res += num.toDouble()
    }

    return res / div
}

fun avgFunc(initial: Float, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = result / numbers.size
    return (avg+initial).toDouble()
}


fun main() {

    val result = avgFunc(5f, 100f, 90f, 80f)  // 첫번째 인자: 초기값, 이후 인자는 가변인자
    println("avg result: $result")
    //val result = maxNumber(5,15)
    //println("max is $result")
//
//    defaultParameter("Hansel")
//    defaultParameter(name="Hansel",age=15)

//    var arr : ArrayList<Int> = ArrayList()
//    arr.add(1)
//    arr.add(5)
//    normalVarargs(1,2,3,4,5)



}