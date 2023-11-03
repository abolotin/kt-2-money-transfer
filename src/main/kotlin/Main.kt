fun main(args: Array<String>) {
    val amount = 1234567
    val taxPercent = 75
    val taxMin = 35

    val tax = amount * taxPercent / 10000

    println(if (tax >= taxMin) tax else taxMin)
}