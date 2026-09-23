package practicas

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4)
    val array2 = intArrayOf(5, 6, 7, 8)

    externo@ for (a in array1) {
        println("Evaluando valor del bucle externo: $a")

        for (b in array2) {
            val suma = a + b

            if (suma > 10) {
                println("  -> Par ($a, $b) descartado (suma = $suma > 10). Saltando a la siguiente iteración del bucle externo.")
                continue@externo
            }

            println("  Par válido: ($a, $b) -> Suma = $suma")
        }
    }
}