

fun main() {

    /*fun part1(input: List<String>): Int {
        var subString1 = ""
        var subString2 = ""
        val points = mutableListOf<Int>()

        for (i in input) {
            val string = i.toString()
            subString1 = string.substring(0, string.length / 2)
            subString2 = string.substring(string.length / 2, string.length)

            for (i in subString1) {
                if (subString2.contains(i)) {
                    points.add( when(i) {
                        in 'a'..'z' -> i.code - 96
                        else -> i.code - 38
                    }
                    )
                    //println(points)
                    break
                }
            }
        }

        return points.sum()
    }*/

    fun part2(input: List<String>): Int {
        val sums = mutableListOf<Int>()
        for (i in 0 until input.size step 3) {
            val line1 = input[i]
            val line2 = input[i + 1]
            val line3 = input[i + 2]

           for (j in 0 until line1.length) {

                if (line2.contains(line1[j]) && line3.contains(line1[j])) {
                    sums.add(when (line1[j]) {
                        in 'a'..'z' -> line1[j].code - 96
                        else -> line1[j].code - 38
                    }
                    )
                    break
                }
            }
        }

        return sums.sum()
    }

    // remove comment to test,
    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day03_pt2_test")
    //check(part1(testInput) == 157)
    //check(part2(testInput) == 70)


    val input = readInput("Day03_input")
//    println(part1(input))
    println(part2(input))
}