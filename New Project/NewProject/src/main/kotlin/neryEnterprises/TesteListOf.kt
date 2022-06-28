package neryEnterprises

fun main() {
    val gabriel = Employee(name = "Gabriel", salary = 4000.0, employment = "PJ")
    val roberto = Employee(name = "Roberto", salary = 2500.0, employment = "CLT")
    val miranda = Employee(name = "Miranda", salary = 3300.0, employment = "CLT")

    val employees = listOf(gabriel, roberto, miranda)

    employees.forEach{ println(it) }

    println("------------")

    println(employees.find { it.name == "Roberto" })

    println("------------")

    employees.sortedBy { it.name }.forEach{ println(it) }

    println("------------")

    employees.groupBy { it.employment }.forEach{ println(it) }

}
