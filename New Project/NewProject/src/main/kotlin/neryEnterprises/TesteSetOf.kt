package neryEnterprises

fun main() {
    val gabriel = Employee(name = "Gabriel", salary = 4000.0, employment = "PJ")
    val roberto = Employee(name = "Roberto", salary = 2500.0, employment = "CLT")
    val miranda = Employee(name = "Miranda", salary = 3300.0, employment = "CLT")

    val employees1 = setOf(gabriel, miranda)
    val employees2 = setOf(roberto)

    val employeesUnion = employees1.union(employees2)
    employeesUnion.forEach { println(it) }

    println("------------")

    val employees3 = setOf(gabriel, roberto, miranda)

    val employeesSubtract = employees3.subtract(employees2)
    employeesSubtract.forEach { println(it) }

    println("------------")

    val employeesIntersect = employees3.intersect(employees2)
    employeesIntersect.forEach { println(it) }
}
