package chap_5.c5_5

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try{
        c = a /b
    }catch (e : ArithmeticException){
        println(e)
        e.printStackTrace()
    }finally {
        println("Done")
    }

}