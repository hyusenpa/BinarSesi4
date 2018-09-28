fun main(args: Array<String>) {

    val nilai = mutableListOf(1, 3, 4, 5)
    val nilai2 = mutableListOf("1", "3", "4", "5")

    nilai.perulangan { i ->

    }

    nilai.forEachIndexed { index, i ->

    }
}

fun <T> List<T>.perulangan(action: (T) -> Unit) {
    for (i in 0 until this.size) {
        action(this[i])
    }
}

fun List<Any>.perulangan2(action: (Any) -> Unit) {
    for (i in 0 until this.size) {
        action(this[i])
    }
}

fun minMax(list: List<Int>, min: (Int) -> Unit, max: (Int) -> Unit) {
    var tempMax = list[0]
    var tempMin = list[0]

    list.forEach {
        if (it <= tempMin) {
            tempMin = it
        } else {
            tempMax = it
        }
    }

    min(tempMin)
    max(tempMax)
}


