package practicas

fun main() {

    println("Escribe hasta que número natural (positivo) quieres que llegue la cuenta")
    var seleccionado: Int? = readln().toIntOrNull() ?: 3

    if (seleccionado!! <= 0) {
        seleccionado = -(seleccionado)
    }

    println("\n ===============\n || RESULTADO ||\n ===============\n")
    for (i in 1..seleccionado) {
        println(i)
    }
}