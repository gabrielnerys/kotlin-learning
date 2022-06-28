package neryEnterprises

data class Employee(
    val name: String,
    val salary: Double,
    val employment: String
) {
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
        """.trimIndent()
}
