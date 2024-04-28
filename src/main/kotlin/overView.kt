open class Animal {
    open fun makeSound(){
        println("Erkan Çalışkan Hoşgeldin")
    }
}
class People : Animal(){
    override fun makeSound() {
        println("Erkan Hoşgeldin")
    }
}

fun main() {
    val animal: Animal = People()
    animal.makeSound()
}