import kotlin.reflect.KProperty

//    lateinit khusus var, lazy property khusus val
lateinit var name: String
val name2: String by lazy {
    "p1"
}
fun main() {

    name = "p1"
//    buat ngecek
    if (::name.isInitialized)
        println("init")
    else
        println("not")
//    object
//    val iniObject = Belajar()
//    println(iniObject.name)
//    iniObject.ngeprint()

    val animal = Animal("p", 10.0, 10, true)
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")

    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

// delegate, seperti extends
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

//class biasa
// primary constructor ()
class Animal (name: String, weight: Double, age: Int, isMammal: Boolean) {
    //    property dengan by
//    var name: Any by DelegateGenericClass()
//    var weight: Any by DelegateGenericClass()
//    var age: Any by DelegateGenericClass
    var name: String
    var weight: Double
    var age: Int
    var isMammal: Boolean
// init, buat ngecek nilai dari constructor
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}
        //    setter & getter
//        get() {
//            println("getter")
////    field = nilai dari property itu sendiri
//            return field
//        }
//        set(value) {
//            println("setter")
//            field = value
//        }

    //    method biasa
    fun ngeprint() {
        println(name)
    }
}