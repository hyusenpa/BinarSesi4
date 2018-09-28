fun main(args: Array<String>) {
    "dasdsadasASDASDsadsdsaDsada".kapital.print()
}


fun Hero.savePlanet() {
    useSuperpowers()
}


fun Any.print() {
    println("Menampilkan : $this")
}

private fun List<Int>.rerata(): Double {
    var temp = 0
    for (i in 0 until this.size) {
        temp += this[i]
    }
    return (temp / this.size).toDouble()
}

private val String.kapital: String
    get() = this.toLowerCase().capitalize()


