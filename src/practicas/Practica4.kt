package practicas
fun main() {
    val calculadora = Calculadora()

    var a : String = "-1"
    var b : String = "-1"

    do {
        println("Escribe el primer número natural para calcular todas las operaciones básicas")
        a = readln()
    } while (a.toInt() < 0)

    do {
        println("Escribe el segundo número natural para calcular todas las operaciones básicas")
        b = readln()
    } while (b.toInt() < 0)

    println("Haciendo todos los cáculos...")
    Thread.sleep(2000L)

    println("La suma es: ${sumar(a.toInt(), b.toInt())}")
    println("La resta es: ${restar(a.toInt(), b.toInt())}")
    println("La multiplicación es: ${multiplicar(a.toInt(), b.toInt())}")
    println("La división es: ${dividir(a.toInt(), b.toInt())}")
}