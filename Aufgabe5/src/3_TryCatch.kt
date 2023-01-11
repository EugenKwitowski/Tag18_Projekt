fun main() {
    //TODO: Ruf die Funktion divideByZero() mit einer Zahl deiner Wahl auf.
    //TODO: Fange den Laufzeitfehler mit einem Try-Catch-Block ab und gib eine Fehlermeldung deiner Wahl über die println()-Funktion in der Konsole aus.

    try {
        divideByZero(5)
    } catch (ex: Exception) {
        println(ex.message)
        println("Sorry! Leider lässt sich keine Zahl durch 0 teilen")
    }
}

fun divideByZero(number: Int): Int {
    return number / 0
}
