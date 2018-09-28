fun main(args: Array<String>) {
    calculateGrade(101).print()
}

val calculateGrade = { grade: Int ->
    when (grade) {
        in 0..40 -> "Fail"
        in 41..70 -> "Success"
        in 71..100 -> "Success"
        else -> false
    }
}

val more = { str: String, int: Int ->
    str + int
}
