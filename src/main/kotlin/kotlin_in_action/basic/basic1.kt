package kotlin_in_action.basic

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width;
        }
}

fun main() {
    val rectangle = Rectangle(200, 200)
    println(rectangle.isSquare)
}