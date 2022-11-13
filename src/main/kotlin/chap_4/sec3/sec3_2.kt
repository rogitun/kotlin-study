package chap_4.sec3

fun shortFunc(a: Int, out: (Int) -> Int): Int {
    return out(a)
}

// 확장 함수
// 클래스의 멤버 함수를 외부에서 더 추가할 수 있다.

fun String.getLongString(target: String) : String =
    if(this.length > target.length) this else target

fun main() {
    val res = shortFunc(3) { x -> x + 6 }
    println(res)


    val std = "Hansel"
    val longString = std.getLongString("Hanseul")
    println(longString)
}