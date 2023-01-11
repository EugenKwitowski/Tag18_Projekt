fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int


    try {
        number = numbers[10]
    } catch (e: Exception) {
        println("Die Nummernliste hat nur 4 Zahlen. Also bis Inedx 3. Index 10 geht nicht ")
        number = -1

    }

}