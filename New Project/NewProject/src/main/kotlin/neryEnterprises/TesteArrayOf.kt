package neryEnterprises

fun main() {
    val myArray = intArrayOf(5, 1, 9, 2, 3)

    for(value in myArray) {
        println(value)
    }

    myArray.sort()
    myArray.forEach { println(it) }
}