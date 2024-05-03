fun main() {
    val bosString= ""
    println(bosString)
    val ad = "Erkan"
    val soyad = "Çalışkan"
    val tamad = "$ad $soyad"
    println(tamad)
    val uzunluk: Int = tamad.length
    println(uzunluk)
    val ilkKarakter: Char = tamad[0]
    println(ilkKarakter)
    val sonKarakter: Char = tamad[tamad.length - 1]
    println(sonKarakter)
    val str1 = "merhaba"
    val str2 = "Merhaba"
    val esitmi: Boolean = str1 == str2
    println(esitmi)
    val sayi = 42
    val sayiString: String = sayi.toString()
    println(sayiString)
    val doubleString = "3"
    val double: Int = doubleString.toInt()
    println(double)
    val parcalanmis: List<String> = tamad.split(" ")
    println(parcalanmis)
    val yas = 50
    val mesaj = "Benim adım $yas"
    println(mesaj)
    val yeniSatir = "bu bir /n yeni satır"
    println(yeniSatir)
    val tab = "bu bir /t tab boşluğu"
    println(tab)
}