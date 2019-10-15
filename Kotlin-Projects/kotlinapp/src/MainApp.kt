class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {
    val lsAnimal = listOf(Animal("Kotlin"), Animal("React"))
    val zoo = Zoo(lsAnimal)

    for (animal in zoo) {
        println("${animal.name}")
    }

}

