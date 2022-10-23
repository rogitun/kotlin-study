package chap_4.sec2

fun main() {

    noParam({"hi"})


    oneParam( { a -> "HI! $a" })

    val a : (a2 : String) -> String = { a2 -> "HI $a2"}


    moreParam({a,b -> "Hi those are the parameters we've got => $a, $b"})

    moreParam({_, b -> "we just ignored the first param $b"})


    withArgs("I'M", "Hansel") { x, y -> "Hi my introduction => $x $y" }
    //마지막 인자가 람다식인 경우 소괄호 바깥으로 분리가 가능하다.


}

fun noParam(out : ()->String) = println(out())
//String 반환하는 람다식
//

fun oneParam(out : (String) -> String){
    println(out("oneParam"))
}

fun moreParam(out : (String,String)->String){
    println(out("First","Second"))
}

fun withArgs(a : String, b:String, out: (String,String)->String){
    println(out(a,b))
}
