package com.mario21ic.demo

enum class Moneda(val simbolo : String) {
    USD("$"), PEN("S/."), ARS("$"), MXN("$"), BOB("\$b"), CLP("$"), COP("$"), PYG("Gs"), UYU("\$U");

    fun format(monto : Double) = "$simbolo $monto"
}
