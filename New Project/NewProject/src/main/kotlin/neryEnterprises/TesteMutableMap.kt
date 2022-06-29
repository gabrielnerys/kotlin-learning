package neryEnterprises

fun main() {
    val gabriel = Employee(name = "Gabriel", salary = 4000.0, employment = "PJ")
    val roberto = Employee(name = "Roberto", salary = 2500.0, employment = "CLT")
    val miranda = Employee(name = "Miranda", salary = 3300.0, employment = "CLT")

    val management = EmployeesManager<Employee>()

    management.create(gabriel.name, gabriel)
    management.create(roberto.name, roberto)
    management.create(miranda.name, miranda)

    println(management.findById(gabriel.name))

    println("------------")

    management.getAll().forEach { println(it) }

    println("------------")

    management.remove(roberto.name)
    management.getAll().forEach { println(it) }

}