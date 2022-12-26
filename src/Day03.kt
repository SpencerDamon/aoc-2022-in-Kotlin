

fun main() {

    fun part1(input: List<String>): Int {
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

        //println(points.sum())
        return points.sum()
    }

/*    fun part2(input: List<String>): Int {

        return 0
    }*/

    // remove comment to test,
    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day03_test")
//    check(part1(testInput) == 157)
    //check(part2(testInput) == 12)


    val input = readInput("Day03_input")
    println(part1(input))
    //println(part2(input))
}