fun main() {
    var saldo = 500.0
    var opcion: Int

    do {
        println()
        println("===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        print("Seleccione una opción: ")

        // readLine() devuelve null o texto; toIntOrNull() evita que el programa
        // se rompa si el usuario escribe letras. Si no es válido, usamos 0.
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Su saldo actual es: $saldo €")
            }

            2 -> {
                print("Introduzca la cantidad a ingresar: ")
                val cantidad = readLine()?.replace(",", ".")?.toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: debe introducir un número válido.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad debe ser mayor que cero.")
                } else {
                    saldo += cantidad
                    println("Ingreso realizado correctamente. Nuevo saldo: $saldo €")
                }
            }

            3 -> {
                print("Introduzca la cantidad a retirar: ")
                val cantidad = readLine()?.replace(",", ".")?.toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: debe introducir un número válido.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad debe ser mayor que cero.")
                } else if (cantidad > saldo) {
                    println("Error: saldo insuficiente.")
                } else {
                    saldo -= cantidad
                    println("Retirada realizada correctamente. Nuevo saldo: $saldo €")
                }
            }

            4 -> {
                println("Gracias por utilizar el cajero. ¡Hasta pronto!")
            }

            else -> {
                println("Opción no válida. Elija un número del 1 al 4.")
            }
        }
    } while (opcion != 4)
}