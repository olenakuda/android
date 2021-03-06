package dice

fun main() {
    for (i in 1..50) {
        mostProbableNumber()
    }
}

private fun mostProbableNumber() {
    val diceRange = 1..6
    val sums = mutableListOf<Int>()
    for (i in 1..50) {
        val randomNumber1 = diceRange.random()
        val randomNumber2 = diceRange.random()
        val sum = randomNumber1 + randomNumber2
        sums.add(sum)
        //println("The number is: $randomNumber1 and $randomNumber2 and sum= $sum")
    }
    val maxValue = sums.groupingBy { it }.eachCount().maxByOrNull { it.value }
    println(maxValue!!.key)
}

