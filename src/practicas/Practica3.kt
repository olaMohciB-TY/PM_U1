package practicas

fun main() {
    val notas = DoubleArray(5)

    for (i in notas.indices) {
        try {
            do {
                println("Escribe la nota ${i+1}/5 (Entre el 0.00 y el 10)")
                notas[i] = readln().toDouble() ?: 0.00
            } while (notas[i] < 0 || notas[i] > 10)
        }catch (e: Exception){
            println("ERROR: $e")
        }
    }

    println("Tus notas son:")
    var media: Double = 0.00
    for (i in notas.indices) {
        println("${notas[i]}")
        media += notas[i]
    }

    println("HACIENDO CÁLCULOS...")
    Thread.sleep(2000L)

    println("MEDIA => $media/${notas.size} = ${media/notas.size}\nMÁXIMA NOTA => ${notas.max()}")

}