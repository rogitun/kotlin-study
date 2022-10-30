package chap_3.unit

class NoResult : Processor<Unit> {
    override fun process() {
        println("No Return")
    }
}