package chap_5.c5_3

fun main() {
    val name = "Hansel"

    for(x in 0..name.length-1){
//        println(name[x])
    }
    //아래와 같음
    for(x in name){
//        println(x)
    }

    //하행 반복
    for(x in name.length-1 downTo 0){
        println(name[x])
    }

    for(x in name.length-1 downTo 0 step 2){
        println(name[x])
    }

    var a = 0
    while(a >= 0 ){
        println(a--)
    }
}