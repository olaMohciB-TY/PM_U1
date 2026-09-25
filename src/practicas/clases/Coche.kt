package practicas.clases

class Coche(val marca: String, val modelo: String) {

    var velocidad: Int = 0
        private set

    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        if (velocidadInicial > 0) {
            velocidad = velocidadInicial
        }
    }

    fun acelerar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad += cantidad
        }
    }

    fun frenar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad -= cantidad
            if (velocidad < 0) {
                velocidad = 0
            }
        }
    }

    override fun toString(): String {
        return "$marca $modelo -> velocidad actual: $velocidad km/h"
    }
}