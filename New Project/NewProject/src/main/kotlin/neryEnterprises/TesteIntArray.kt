package neryEnterprises

fun main() {
    val myArray = IntArray(size = 5)
    myArray[0] = 5
    myArray[1] = 1
    myArray[2] = 9
    myArray[3] = 2
    myArray[4] = 3

    for(valor in myArray){
        println(valor)
    }

    myArray.forEach { valor -> println(valor) }

    for(index in myArray.indices){
        println(myArray[index])
    }

    myArray.sort()
    for(index in myArray) {
        println(index)
    }

}