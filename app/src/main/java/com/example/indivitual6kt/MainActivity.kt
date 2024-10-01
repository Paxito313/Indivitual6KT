import java.text.NumberFormat
import kotlin.math.ceil

fun suma(num1: Double?, num2: Float?): Double? {
    return if (num1 != null && num2 != null) {
        num1 + num2
    } else {
        null
    }
}

fun redondeo(num: Double?) {
    if (num != null && num >= 0) {
        val redondeado = ceil(num)
        println("El número redondeado hacia arriba es: $redondeado")
    } else {
        println("Error: Número no válido.")
    }
}

fun muestraResultado(num: Double?) {
    if (num != null && num >= 0) {
        val formatoMoneda = NumberFormat.getCurrencyInstance()
        println("El número con formato de moneda es: ${formatoMoneda.format(num)}")
    } else {
        println("Error: Número no válido.")
    }
}

fun main() {
    val num1 = 5.67
    val num2 = 2.34f

    val resultadoSuma = suma(num1, num2)
    if (resultadoSuma != null) {
        println("La suma es: $resultadoSuma")
        redondeo(resultadoSuma)
        muestraResultado(resultadoSuma)
    }
}
