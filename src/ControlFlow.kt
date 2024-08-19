fun main() {
    val value: Any = 10
    val ranges = 6..10
//    when == switch case
//    bisa dijadikan expression
    val isiValue = when (value) {
        is Int -> {
            when (value) {
                6 -> 6
                7 -> 7
                else -> "tidak ada"
            }
        }

        in ranges -> "ketemu"
        !in ranges -> "tidak ketemu"

        is String -> "string"

        else -> "tidak valid"
    }
    println(isiValue)
}