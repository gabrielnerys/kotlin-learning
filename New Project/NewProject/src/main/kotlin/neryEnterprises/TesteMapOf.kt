package neryEnterprises

fun main() {
    val pair: Pair<String, Double> = Pair("Gabriel", 3600.0)
    val map1 = mapOf(pair)

    map1.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

    val map2 = mapOf(
        "João" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

}