package neryEnterprises

fun main() {
    val gabriel = Employee(name = "Gabriel", salary = 4000.0, employment = "PJ")
    val roberto = Employee(name = "Roberto", salary = 2500.0, employment = "CLT")
    val miranda = Employee(name = "Miranda", salary = 3300.0, employment = "CLT")

    val employees = mutableListOf(roberto, miranda)
    employees.forEach { println(it) }

    println("------------")

    employees.add(gabriel)
    employees.forEach { println(it) }

    println("------------")

    employees.remove(roberto)
    employees.forEach { println(it) }

    println("------------")

    val employeeSet = mutableSetOf(gabriel)
    employeeSet.forEach { println(it) }

    println("------------")

    employeeSet.add(roberto)
    employeeSet.add(miranda)
    employeeSet.forEach { println(it) }
}