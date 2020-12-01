package sorting
import java.util.*

val s = Scanner(System.`in`)

fun main() {
    val numbers = mutableListOf<Int>()
    do {
        numbers += s.nextInt()
    } while(s.hasNext())
    val maxNumber = numbers.max()
    println("Total numbers: ${numbers.size}.\n" +
            "The greatest number: $maxNumber (${numbers.count { it == maxNumber }} time(s)).")
}
