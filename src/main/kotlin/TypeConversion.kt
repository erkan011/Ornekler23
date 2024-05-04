class MetinDegeri(private val deger:String){
    fun toInt():Int {
        return deger.toIntOrNull() ?: 0
    }
}
fun main() {
    val metinDegeri = MetinDegeri("15")
    val intDeger1 = metinDegeri.toInt()
    println(intDeger1)

    val sayi = 5
    val uzunSayi: Long = sayi.toLong()
    println(uzunSayi)

    val sayi1 = 50.55
    val strSayi: String = sayi1.toString()
    println(strSayi)

    val stringSayi:String? = "10"
    val intSayi: Int? = stringSayi as? Int
    println(intSayi)

    val byteDeger: Byte = 12
    val intDeger: Int = byteDeger.toInt()
    println(intDeger)

    val intsayi = 5
    val doublesayi = intsayi.toDouble()
    println(doublesayi)
}