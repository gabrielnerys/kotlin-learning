package neryEnterprises

fun main() {
    val salaries = doubleArrayOf(2150.0, 1350.0, 4000.0)

    for(values in salaries) {
        println(values)
    }
    println("------------")

    println("O maior salário é ${salaries.maxOrNull()}")
    println("O menor salário é ${salaries.minOrNull()}")
    println("A média salarial é ${salaries.average()}")

    println("------------")

    val filterSalaries = salaries.filter { it > 2000.0 }

    println(filterSalaries)

    filterSalaries.forEach{ println(it) }
}