package com.mario21ic.demo

import java.util.*

//fun sumar(a : Int, b : Int): Int {
//    return a + b
//}
fun sumar(a : Int, b : Int) = a + b

fun esMayorDeEdad(edad : Int) = if (edad >= 18) true else false

//class Persona(val nombre : String, var edad : Int) {
//    val esMayorDeEdad: Boolean
//        get() = if(edad >= 18) true else false
//
//    val myOwnPrint: String
//        get()  = "Nombre: $nombre - $edad"
//
//    val nameUpperCase = nombre.toUpperCase()
//}

fun main(args: Array<String>) {
    println("Hola Kotlin")

    // Functions
    println(sumar(12, 5))
    println(esMayorDeEdad(21))

    // Vars
    val nombre = "Juan Perez" // immutable, similar java's final
    var edad = 17
    var edadDouble = 17.6
    println(esMayorDeEdad(edad))
    edad = 21
    println(esMayorDeEdad(edad))
    println("Double: " + esMayorDeEdad(edadDouble.toInt()))
//    edad = "28" // Error of type mismatch

    // String templates
    println("Escribe tu nombre o pulsa Enter para seguir anonimo")
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    println("Hola ${if(nextLine != "") nextLine else "Kotlin"}")
    val name = if(nextLine != "") nextLine else "Kotlin"
    println("Hola " + name)
    println("Hola $name")

    // Class
    val persona = Persona("Mario", 17)
    println("${persona.nombre} - ${persona.edad} - ${persona.esMayorDeEdad}")
    persona.edad = 34
    println("${persona.nombre} - ${persona.edad} - ${persona.esMayorDeEdad}")
    println("${persona.myOwnPrint}")
    println("${persona.nameUpperCase}")
    persona.apellido = "Inga"
    println(persona.apellido)

    // Enumeradores
    println(Moneda.ARS)
    println(Moneda.PEN.simbolo)
    println(Moneda.PEN.format(200.0))


}

