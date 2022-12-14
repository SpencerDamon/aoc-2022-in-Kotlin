
fun main() {

    fun part1(input: List<String>): Int {
        var myTotalScore = 0

        for (i in input) {
            val (otherPlayer, myPlay) = i.split(" ")
            when (otherPlayer) {
                "A" -> if (myPlay == "X") {
                    myTotalScore += 4 // 1 for rock, 3 for draw
                } else if (myPlay == "Y") {
                    myTotalScore += 8 // 2 for paper, 6 for win
                } else myTotalScore += 3 // 3 for scissors, 0 for lose

                "B" -> if (myPlay == "X") {
                    myTotalScore += 1 // 1 for rock, 0 for lose
                } else if (myPlay == "Y") {
                    myTotalScore += 5 // 2 for paper, 3 for draw
                } else myTotalScore += 9 // 3 for scissors, 6 for win

                "C" -> if (myPlay == "X") {
                    myTotalScore += 7 // 1 for rock, 6 for win
                } else if (myPlay == "Y") {
                    myTotalScore += 2 // 2 for paper, 0 for lose
                } else myTotalScore += 6 // 3 for scissors, 3 for draw

            }

        }
        //println(myTotalScore)

        return myTotalScore
    }

    /* Return sum of highest 3 sums dilineated by "" */
    fun part2(input: List<String>): Int {
        var myTotalScore = 0

        for (i in input) {
            val (otherPlayer, myPlay) = i.split(" ")
            when (otherPlayer) {
                "A" -> if (myPlay == "X") {
                    myTotalScore += 3 // 3 for scissors, 0 for lose
                } else if (myPlay == "Y") {
                    myTotalScore += 4 // 1 for rock, 3 for draw
                } else myTotalScore +=  8// 2 for paper, 6 for win

                "B" -> if (myPlay == "X") {
                    myTotalScore += 1 // 1 for rock, 0 for lose
                } else if (myPlay == "Y") {
                    myTotalScore += 5 // 2 for paper, 3 for draw
                } else myTotalScore += 9 // 3 for scissors, 6 for win

                "C" -> if (myPlay == "X") {
                    myTotalScore += 2 // 2 for paper, 0 for lose
                } else if (myPlay == "Y") {
                    myTotalScore += 6// 3 for scissors, 3 for draw
                } else myTotalScore += 7 // 1 for rock, 6 for win

            }

        }
        //println(myTotalScore)

        return myTotalScore
    }


    // remove comment to test,
    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day02_test")
    //check(part1(testInput) == 15)
    //check(part2(testInput) == 12)


    val input = readInput("Day02_input")
    println(part1(input))
    println(part2(input))
}
