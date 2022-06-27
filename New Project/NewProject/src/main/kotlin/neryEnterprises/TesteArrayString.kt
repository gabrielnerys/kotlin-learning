package neryEnterprises

fun main() {
    val names = Array(size = 3) {""}

    names[0] = "Gabriel"
    names[1] = "Philipi"
    names[2] = "John"

    for(name in names){
        println(name)
    }

    names.sort()
    names.forEach { println(it) }

    val names2 = arrayOf("Roberta", "Maria", "Camila")

    for(name in names2) {
        println(name)
    }

    names2.sort()
    names2.forEach { println(it) }
}