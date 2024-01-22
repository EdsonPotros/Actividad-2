package com.example.actividad2

/**
 * Práctica: Cadena Fina
 * Nombre: Edson Arvizu
 * ID 180932
 */

fun String.esFina(): Boolean {
    val condition1 = !contains("bu") && !contains("ba") && !contains("be")
    val condition2 = count { it in setOf('a', 'e', 'i', 'o') } >= 3
    val condition3 = windowed(2).any { it[0] == it[1] }

    return listOf(condition1, condition2, condition3).count { it } >= 2
}

fun main(args: Array<String>){
    println("bac".esFina()) // Resultado Esperado: False
    println("aza".esFina()) // Resultado Esperado: False
    println("abaca".esFina()) // Resultado Esperado: False
    println("baaa".esFina()) // Resultado Esperado: true
    println("aaab".esFina()) // Resultado Esperado: true
}