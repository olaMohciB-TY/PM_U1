package practicas

fun main() {
    println("Necesito una cadena de texto amplia:")
    val cadena = readlnOrNull() ?: ""
    val longitud = cadena.length

    if (longitud == 0) {
        println("Error: no se ha introducido ninguna cadena de texto.")
        return
    }

    println("¿En que posicion quieres buscar?")
    val posicionInput = readLine() ?: "0"

    val posicion: Int
    try {
        posicion = posicionInput.toInt()
    } catch (e: NumberFormatException) {
        println("Error: '$posicionInput' no es un numero entero valido.")
        return
    }

    if (posicion < 0 || posicion >= longitud) {
        println("Error: la posicion $posicion esta fuera de los limites de la cadena (rango valido: 0..${longitud - 1}).")
        return
    }

    println("Buscando la letra en la posicion $posicion...")
    val letra = busquedaPosicion(cadena, posicion)
    Thread.sleep(1500L)

    println("Buscando la letra en las posiciones anterior y posterior...")
    val anterior = busquedaPosicion(cadena, posicion - 1)
    val posterior = busquedaPosicion(cadena, posicion + 1)
    Thread.sleep(2500L)

    val anteriorTexto = anterior?.toString() ?: "no existe (es la primera posicion)"
    val posteriorTexto = posterior?.toString() ?: "no existe (es la ultima posicion)"

    print("La letra que buscas en la posicion $posicion es $letra.\nY las letras anterior y posterior son $anteriorTexto y $posteriorTexto respectivamente.")
}

fun busquedaPosicion(cadena: String, posicion: Int): Char? {
    return if (posicion in cadena.indices) cadena[posicion] else null
}