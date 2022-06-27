package neryEnterprises

fun main() {
    val salary = DoubleArray(size = 3)

    salary[0] = 2500.0
    salary[1] = 1350.0
    salary[2] = 780.0

    for(value in salary) {
        println(value)
    }

    println("------------")

    salary.forEachIndexed { index, value ->
        salary[index] = value * 1.2
    }

    salary.forEach { println(it) }

    println("------------")

    val salary2 = doubleArrayOf(1200.0, 2300.0, 1500.0)

    salary2.sort()
    salary2.forEach { println(it) }

    println("------------")

    salary2.forEachIndexed { index, value ->
        salary2[index] = value * 1.3
    }

    for(value in salary2) {
        println(value)
    }

}