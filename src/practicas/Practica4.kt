package practicas

fun main() {
    val calculadora = Calculadora()

    var a : Int
    var b : Int

    println("Escribe el primer número para calcular todas las operaciones básicas")
    a = readln().toInt()


    println("Escribe el segundo número para calcular todas las operaciones básicas")
    b = readln().toInt()

    println("Haciendo todos los cáculos...")
    Thread.sleep(2000L)

    println("La suma es: ${sumar(a, b)}")
    println("La resta es: ${restar(a, b)}")
    println("La multiplicación es: ${multiplicar(a, b)}")
    println("La división es: ${dividir(a, b)}")
}