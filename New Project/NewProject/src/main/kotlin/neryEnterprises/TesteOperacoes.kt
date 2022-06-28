package neryEnterprises

fun main() {
    val salaries = doubleArrayOf(2150.0, 1350.0, 4000.0)

    for(values in salaries) {
        println(values)
    }
    println("------------")

    salaries.sort()

    println("O maior salário é ${salaries[2]}")
    println("O menor salário é ${salaries[0]}")
    println("A média salarial é ${salaries.average()}")

    println("------------")

    val filterSalaries = salaries.filter { it > 2000.0 }

    println(filterSalaries)
}