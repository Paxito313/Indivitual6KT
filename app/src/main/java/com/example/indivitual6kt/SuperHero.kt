data class Superhero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    var photo: String
) {
    init {
        require(superhero.isNotEmpty()) { "Error: El nombre del superhéroe no puede estar vacío." }
        require(publisher.isNotEmpty()) { "Error: El editor no puede estar vacío." }
        require(realName.isNotEmpty()) { "Error: El nombre real no puede estar vacío." }
        require(photo.isNotEmpty()) { "Error: La foto no puede estar vacía." }
    }
}

fun agregarSuperheroes() {
    val listaSuperheroes = mutableListOf<Superhero>()

    try {
        listaSuperheroes.add(Superhero("Spider-Man", "Marvel", "Peter Parker", "spiderman.jpg"))
        listaSuperheroes.add(Superhero("Batman", "DC", "Bruce Wayne", "batman.jpg"))
        listaSuperheroes.add(Superhero("Wonder Woman", "DC", "Diana Prince", "wonderwoman.jpg"))
        listaSuperheroes.add(Superhero("", "Marvel", "Steve Rogers", "captainamerica.jpg"))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    for (superhero in listaSuperheroes) {
        println("Superhéroe: ${superhero.superhero}, Publicado por: ${superhero.publisher}, Nombre real: ${superhero.realName}, Foto: ${superhero.photo}")
    }
}

fun main() {
    agregarSuperheroes()
}
