fun main() {
    val number = intArrayOf(1, 2, 3, 4, 5)

    val names = arrayOf("Alice", "Bob", "Charlie")

    val flags = booleanArrayOf(true, false, true)
    println(flags.joinToString())

    val characters = charArrayOf('a', 'b', 'c')
    println(characters.joinToString())

    val firstNumber = number[0]
    val secondName = names.toString()

    println(firstNumber)
    println(secondName)
    number[2] = 10
    names[0] = "Eve"

    println(number.joinToString())
    println(names.joinToString())

    val size = number.size
    println(size)

    val count = names.count()
    println(count)

    for (numbers in number){
        println(numbers)
    }
    names.forEach { name ->
        println(name)
    }

    val sum = number.sum()
    println(sum)

    val subArray = number.sliceArray(1..3)
    println(subArray.joinToString())


    val charecter = charArrayOf('x' , 'y')
    println(charecter.reversed())
}