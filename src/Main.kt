//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //    val namaVariabel:Type = const js/dart
    val name:String = "Kotlin"
    //    var namaVariabel:Type= let/var js/dart
//    escaped string \
    var name2:String = "Kotlin \"awesome\""
//    raw string
    val namaLengkap:String = """
        kotlin
        dicoding
        indonesia
    """.trimIndent()
    println("Hello, $name!")
    println("Hello, $name2!")
    println(namaLengkap)
//    String == array
    println(name[1])
//    aritmatikanya sama saja
    val angka1:Int = 1
    var angka2:Int = 2
    angka2 += 2
    angka2 -= 1
    println(angka1 + angka2)
    println(angka1 - angka2)
    println(angka1 * angka2)
    println(angka1 % angka2)
    for (i in 0..5) {
        println(if (i % 2 == 0) "i = $i" else "tidak genap")
    }
//    operator logika sama saja
    val iniTrue:Boolean = true
    val iniFalse:Boolean = false

    if (iniTrue && !iniFalse){
        println("and + not(kebalikan)")
    } else if(iniTrue || iniFalse){
        println("or")
    }
//    array
    val iniArray = arrayOf(1,2,3,"p")
    for (i in iniArray){
        println(i)
    }
//    nullable
    var iniString:String? = "nullable"
//    cara manual
    if (iniString !== null){
        println(iniString.length)
    }
//    safe call
    println(iniString?.length)
//    elvis
    var iniStringLength = iniString?.length ?: 10
    println(iniStringLength)

//    function dengan return value & non return value
    fun User(userName: String = "kotlin", age: Int = 21): String {
        return println("$userName, $age").toString()
    }
    User(userName = name, age = 21)
    fun UserNoParam(): Unit {
        println("$name, 21")
    }
    UserNoParam()

//    vararg
    fun nambah(vararg number: Int): Int {
        return number.sum()
    }

    val penambahan = nambah(22,21,32,33)
    println(penambahan)
}