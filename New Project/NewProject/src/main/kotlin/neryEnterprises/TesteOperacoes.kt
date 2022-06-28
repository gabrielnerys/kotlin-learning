package neryEnterprises

fun main() {
    val salaries = doubleArrayOf(2150.0, 1350.0, 4000.0)

    for(values in salaries) {
        println(values)
    }
    println("------------")

    println("O maior salário é ${salaries.maxOrNull()}")
    // Retorna maior valor do array
    println("O menor salário é ${salaries.minOrNull()}")
    // Retorna menor valor do array
    println("A média salarial é ${salaries.average()}")
    // Retorna média de valores do array

    println("------------")

    val filterSalaries = salaries.filter { it > 2000.0 }

    println(filterSalaries)
    // Imprime array contendo valores filtrados

    println("------------")

    filterSalaries.forEach{ println(it) }
    // Para cada elemento no array, imprime em uma linha

    println("------------")

    println(salaries.count { it in 1300.0..5000.0 })
    // Retorna quantidade de elementos que existem dentro do range determinado

    println("------------")

    println(salaries.find { it == 1350.0 })
    // Verifica se existe elemento no array e retorna o elemento caso exista, ou
    // null caso não seja encontrado

    println("------------")

    println(salaries.any { it == 2150.0 })
    // Verifica se existe elemento no array e retorna boolean
}