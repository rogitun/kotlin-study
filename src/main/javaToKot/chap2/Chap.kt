package chap2

fun main() {
    // null을 다루는 방법


    // safe call / elvis
    val str: String? = "ABC"
    // str.length 불가능. nullable이니까.
    str?.length //가능. 값이 null이면 다 null이 됨.

    // elvis
    var str2: String? = "ABC"

    println(str2)
    str2 = null
    println(str2?.length ?: 0) //null이면 0

}

// nullable.
fun startsWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null;")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

