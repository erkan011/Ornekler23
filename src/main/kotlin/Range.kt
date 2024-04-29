fun main() {
    val number = 7
    when (number){
        in 1..5 -> println("1 ile 5 aralığında")
        in 6..10 -> println("6 ile 10 aralığında")
    }
}

//fun main() {
//    for (i in 1..9){
//        print(i)  //Çıktı = 123456789
//    }
//}

//fun main() {
//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
//    val filterNumber = numbers.filter { it in 3..8 }
//    println(filterNumber)
//}