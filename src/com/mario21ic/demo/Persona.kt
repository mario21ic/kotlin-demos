package com.mario21ic.demo

class Persona(val nombre : String, var edad : Int) {
    val esMayorDeEdad: Boolean
        get() = if(edad >= 18) true else false
//        get() {
//            return if(edad >= 18) true else false
//        }

    var apellido : String = "Anon"
        get() = field
        set(newApellido) {
            field = newApellido
        }

    val myOwnPrint: String
        get() {
            return "Nombre: $nombre - $edad"
        }

    val nameUpperCase = nombre.toUpperCase()
}