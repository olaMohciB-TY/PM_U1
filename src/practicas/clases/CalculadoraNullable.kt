package practicas.clases

class CalculadoraNullable {

    // Suma
    fun sumar(a: Int?, b: Int?): Int {
        return ((a ?: 0) + (b ?: 0))
    }

    // Resta
    fun restar(a: Int?, b: Int?): Int {
        return ((a ?: 0) - (b ?: 0))
    }

    // Multiplicación
    fun multiplicar(a: Int?, b: Int?): Int {
        return ((a ?: 0) * (b ?: 0))
    }

    // División
    fun dividir(a: Int?, b: Int?): Int {
        return ((a ?: 0) / (b ?: 0))
    }
}