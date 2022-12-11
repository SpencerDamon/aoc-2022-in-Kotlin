import kotlin.math.max
fun main() {
    fun part1(input: List<String>): Int {
        var highestSum = 0
        var currentSum = 0
        for (s in input) {

            if (s.isEmpty()) { // if (see an empty line)
                highestSum = max(highestSum, currentSum)
                currentSum = 0
            } else {
                currentSum += s.toInt()
            }
        }

        return highestSum
    }

    /*
    fun part2(input: List<String>): Int {
        return input.size
    }
     */

    // test if implementation meets criteria from the description, like:
    //val testInput = File("src/Day01_test.txt").readText()
    //check(part1(testInput) == 54000)


    val testInput = readInput("Day01_test")
    println(part1(testInput))
    // println(part2(input))
}
