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

    val primera : Int = a.toInt()
    val segunda : Int = b.toInt()

    println("Haciendo todos los cáculos...")
    Thread.sleep(2000L)

    println("La suma es: ${sumar(primera, segunda)}")
    println("La resta es: ${restar(primera, segunda)}")
    println("La multiplicación es: ${multiplicar(primera, segunda)}")
    println("La división es: ${dividir(primera, segunda)}")
}