package practicas

fun main() {

    println("Escribe tu peso en kilogramos (kg)")
    val peso: Double = readln().toDouble()

    println("Escribe tu altura en metros (m)")
    val altura: Double = readln().toDouble()

    val imc = peso / (altura * altura)

    println("Calculando Índice de Masa Corporal...")
    Thread.sleep(2000L)

    println("Tu IMC es: %.2f".format(imc))

    val resultado = when {
        imc < 18.5 -> "Bajo peso"
        imc in 18.5..24.9 -> "Normal"
        imc in 25.0..29.9 -> "Sobrepeso"
        else -> "Obesidad"
    }

    println("Diagnóstico: $resultado")
}