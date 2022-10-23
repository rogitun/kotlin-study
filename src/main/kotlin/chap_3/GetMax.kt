package chap_3

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

fun main() {
    val result = maxNumber(5,15)
    //println("max is $result")
//
//    defaultParameter("Hansel")
//    defaultParameter(name="Hansel",age=15)

//    var arr : ArrayList<Int> = ArrayList()
//    arr.add(1)
//    arr.add(5)
//    normalVarargs(1,2,3,4,5)


    val res = average(1.5F,2.3F,4.5F,6.7F)

    println(res.toInt())



}