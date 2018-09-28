fun main(args: Array<String>) {
    val nilai = mutableListOf(1, 3, 4, 5)
    mixMaxValue(nilai)
}

fun mixMaxValue(list: List<Int>) {
    var (tempMin, tempMax) = list
    list.forEach {
        if (it <= tempMin) {
            tempMin = it
        } else {
            tempMax = it
        }
    }
    min(tempMin).print()
    max(tempMax).print()
}

private fun min(data: Int): Int {
    return data
}

private fun max(data: Int): Int {
    return data
}