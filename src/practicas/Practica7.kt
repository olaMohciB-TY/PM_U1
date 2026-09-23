package practicas

fun main() {

    println("Escribe la primera nota")
    val nota1: Double = readln().toDouble()

    println("Escribe la segunda nota")
    val nota2: Double = readln().toDouble()

    println("Escribe la tercera nota")
    val nota3: Double = readln().toDouble()

    println("Escribe la cuarta nota")
    val nota4: Double = readln().toDouble()

    val promedio = (nota1 + nota2 + nota3 + nota4) / 4

    println("Calculando media...")
    Thread.sleep(2000L)

    println("Tu promedio es: %.2f".format(promedio))

    val resultado = when {
        promedio >= 10 -> "Matrícula de Honor"
        promedio >= 9 -> "Sobresaliente"
        promedio >= 7 -> "Notable"
        promedio >= 5 -> "Aprobado"
        else -> {
            println("¿Te presentaste a la recuperación? (S/N)")
            val respuesta = readln().uppercase()

            when (respuesta) {
                "S" -> "En recuperación"
                "N" -> "Suspenso"
                else -> "Respuesta no válida"
            }
        }
    }

    println("Resultado final: $resultado")
}