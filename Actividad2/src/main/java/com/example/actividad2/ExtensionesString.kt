package com.example.actividad2

/**
 * Práctica: Cadena Fina
 * Nombre: Edson Arvizu
 * ID 180932
 */

fun String?.esVaciaONula(): Boolean {
    return this == null || this.trim().isEmpty()
}

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.esVaciaONula() == true)
    println(s2.esVaciaONula() == true)

    val s3 = "    "
    println(s3.esVaciaONula() == true)
}



