package practicas

import practicas.clases.Coche

fun main() {
    println("=== Coche 1: constructor primario ===")
    val coche1 = Coche("Toyota", "Corolla")
    println(coche1)
    coche1.acelerar(50)
    println("= TRAS ACELERAR =")
    println(coche1)
    coche1.frenar(20)
    println("= TRAS FRENAR =")
    println(coche1)

    println("\n=== Coche 2: constructor secundario ===")
    val coche2 = Coche("Seat", "Ibiza", 30)
    println(coche2)
    coche2.acelerar(40)
    println("= TRAS ACELERAR =")
    println(coche2)
    coche2.frenar(10)
    println("= TRAS FRENAR =")
    println(coche2)

    println("\n=== Coche 3: control de velocidad mínima ===")
    val coche3 = Coche("Renault", "Clio", 20)
    println(coche3)
    coche3.frenar(50)
    println("= TRAS FRENAR =")
    println(coche3)
}