package practicas

import extras.Calculadora

fun main() {
    val calculadora = Calculadora()

    var a : Int
    var b : Int

    println("Escribe el primer número para calcular todas las operaciones básicas")
    a = readln().toInt()


    println("Escribe el segundo número para calcular todas las operaciones básicas")
    b = readln().toInt()

    println("Haciendo todos los cáculos...")
    Thread.sleep(2000L)

    println("La suma es: ${calculadora.sumar(a, b)}")
    println("La resta es: ${calculadora.restar(a, b)}")
    println("La multiplicación es: ${calculadora.multiplicar(a, b)}")
    println("La división es: ${calculadora.dividir(a, b)}")
}