package neryEnterprises

import java.math.BigDecimal

fun Array<BigDecimal>.sum() = this.reduce{
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.average() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.sum() / this.size.toBigDecimal()