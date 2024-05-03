fun greetUser(isMorning: Boolean){
    if (isMorning){
        println("Günaydın !")
    }else{
        println("İyi Günler !!")
    }
}
fun main() {

    greetUser(true)
    greetUser(false)


    val isSunny= true
    val isRaining = false


    if (isSunny){
        println("hava açık")
    }else{
        println("hava kapalı")
    }

    if (isRaining){
        println("açık")
    }else{
        println("kapalı")
    }

    val a = 5
    val b =10

    var result: Boolean = (a > b)
    println(result)

    result = (a <= b)
    println(result)

    val x = true
    val y = false

    var result1: Boolean = x && y
    println(result1)

    result1 = x || y
    println(result1)

    result1 = !x
    println(result1)
}



