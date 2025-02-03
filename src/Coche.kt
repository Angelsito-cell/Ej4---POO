class Coche(
    marca: String?,
    modelo: String?,
    numCaballos: Int?,
    numPuertas: Int?,
    matricula: String?,
    color: String?
) {
    val marca: String
    val modelo: String
    val numCaballos: Int
    val numPuertas: Int
    val matricula: String
    var color: String

    init {
        // Validación marca
        require(!marca.isNullOrBlank()) { "Marca no puede ser nula o vacía" }
        this.marca = marca.trim().replaceFirstChar { it.uppercase() }

        // Validación modelo
        require(!modelo.isNullOrBlank()) { "Modelo no puede ser nulo o vacío" }
        this.modelo = modelo.trim().replaceFirstChar { it.uppercase() }

        // Validación caballos
        require(numCaballos != null) { "Número de caballos no puede ser nulo" }
        require(numCaballos in 70..700) { "Caballos fuera de rango (70-700)" }
        this.numCaballos = numCaballos

        // Validación puertas
        require(numPuertas != null) { "Número de puertas no puede ser nulo" }
        require(numPuertas in 3..5) { "Puertas fuera de rango (3-5)" }
        this.numPuertas = numPuertas

        // Validación matrícula
        require(matricula != null) { "Matrícula no puede ser nula" }
        require(matricula.length == 7) { "Matrícula debe tener 7 caracteres" }
        this.matricula = matricula

        // Validación color
        this.color = color?.takeIf { it.isNotBlank() } ?: "Blanco"
    }

    // Setter modificado para color
    fun setColor(nuevoColor: String?) {
        require(nuevoColor != null) { "Color no puede ser nulo" }
        require(nuevoColor.isNotBlank()) { "Color no puede estar vacío" }
        color = nuevoColor
    }

    override fun toString(): String {
        return "$marca $modelo - Color: $color, $numCaballos CV, $numPuertas puertas, Matrícula: $matricula"
    }
}