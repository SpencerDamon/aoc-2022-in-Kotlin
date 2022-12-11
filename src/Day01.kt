import kotlin.math.max
fun main() {
    /* Return highest sum dilineated by "" */
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

    /* Return sum of highest 3 sums dilineated by "" */
    fun part2(input: List<String>): Int {
        val highestScores = mutableListOf<Int>() // store all the scores
        var currentSum = 0
        for (s in input) {
            if (s.isEmpty()) {
                highestScores.add(currentSum) // add current sum to list
                currentSum = 0
            } else {
                currentSum += s.toInt() // add int value to var
            }
        }
        highestScores.sortDescending() // sort list
        //println
        return highestScores.take(3).sum() // sums the numbers from the 3 highest scores
        //return input.size
    }


    // remove comment to test,
    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    //check(part1(testInput) == 24000)
    //check(part2(testInput) == 41000)


    val input = readInput("Day01_input")
    println(part1(input))
    println(part2(input))
}
