fun main() {
    try {
        // Instancia válida
        val c1 = Coche("toyota ", " corolla", 120, 4, "ABC1234", "Rojo")
        println(c1)  // Toyota Corolla (Rojo), 120 CV, 4 puertas, mat. ABC1234

        // Intento de color nulo (falla)
        c1.setColor(null)
    } catch (e: Exception) {
        println("Error: ${e.message}")  // Error: Color no puede ser nulo
    }

    // Test de validaciones
    try {
        Coche(null, "modelo", 60, 3, "1234567", "Azul")  // Caballos <70
    } catch (e: IllegalArgumentException) {
        println(e.message)  // Caballos inválidos: 60
    }
}