fun karakteriYazdir(harf4:Char){
    println("Girilen karakter: $harf4")
}
fun main() {
    val harf = 'E'
    val sayi = '3'
    println(harf)
    println(sayi)

    val harf1 = 'A'
    val harf2 = 'B'
    if (harf1 < harf2) {
        println("$harf1 , $harf2 den küçük")
    } else {
        println("$harf1 , $harf2 den büyük")
    }

    val harfler = CharArray(3)
    harfler[0] = 'a'
    harfler[1] = 'b'
    harfler[2] = 'c'
    println(harfler)
    println(harfler.contentToString())

    val alfabe = 'A'..'Z'
    for (harfler1 in alfabe){
        println(harfler1)
    }

    karakteriYazdir('X')

    val metin1 = "Merhaba"
    val harfdizisi = metin1.toCharArray()
    println(harfdizisi.contentToString())
}