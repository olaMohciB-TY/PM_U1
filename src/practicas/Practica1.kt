package practicas

fun main() {
    println("¿Cómo te llamas?")
    val nombre = readLine()

    println("¿Cual es tu edad?")
    val edadInput = readLine() ?: "0"
    val edad = edadInput.toInt()

    println("Calculando...")
    val edadFutura = edad + 5
    Thread.sleep(2000L)

    print("Entonces, $nombre, dentro de 5 añitos tendrías: $edadFutura años.")
}