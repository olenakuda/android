package dice

class Dice(var sides: Int = 6) {

    fun roll() = (1..sides).random()

}
