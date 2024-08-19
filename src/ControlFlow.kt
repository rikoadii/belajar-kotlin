fun main() {
    val value: Any = 10
//    step buat ngatur, gunakan downTo jika nilai turun, terdapat IntRange, LongRange, CharRange
    val ranges = 1..10 step 2
    var counter = 4
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

//    while & do while, umum
    do {
        println("p")
        counter--
    } while (
        counter > 1
    )

//    continue & break dengan label @
    outerLoop@ for (i in 1..4){
        for (j in 1..4){
//            jadi, outerLoop akan berhenti
            if (j == 2) break@outerLoop
            println("i: $i, j: $j")
        }
    }

    outerLoop2@ for (i in 1..4){
        for (j in 1..4){
//            jadi, loop kedua akan dilompati
            if (j == 2) continue@outerLoop2
            println("i: $i, j: $j")
        }
    }
}
