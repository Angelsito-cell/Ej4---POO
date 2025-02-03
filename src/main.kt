fun main() {
    val personas = listOf(
        Persona("Ana", 1.68, 65.0),
        Persona("Luis", 1.80, 80.0)
    )

    personas.forEach {
        println(it.saludar())
        println(it.obtenerDesc())
    }
}