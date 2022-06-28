package neryEnterprises

fun main() {
    val gabriel = Employee(name = "Gabriel", salary = 4000.0)
    val roberto = Employee(name = "Roberto", salary = 2500.0)
    val miranda = Employee(name = "Miranda", salary = 3300.0)

    val employees = listOf(gabriel, roberto, miranda)

    employees.forEach{ println(it) }

    println("------------")

    println(employees.find { it.name == "Roberto" })

    println("------------")

    employees.sortedBy { it.name }.forEach{ println(it) }
}

data class Employee(
    val name: String,
    val salary: Double
) {
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
        """.trimIndent()
}
