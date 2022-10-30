package chap_3.chap_3_1

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun function() : Unit{
    println("asdasd")
}

fun trick(number:Short, number2: Float) = number + number2

fun main() {

    val res = trick(5, 5.1F)
    print(res)


    function();
}

fun local(){
    //localLocal() //불가능
    fun localLocal(){
        println("Local Local")
    }
    localLocal()// 가능
}

class User(val id : Int, val name : String, val address: String)
fun localFunction(user : User){
    fun validate(input : String){
        if(input.isEmpty()){
            println("Failed")
        }
    }
    validate(user.name)
    validate(user.address)
}

