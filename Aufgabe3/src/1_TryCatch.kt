fun main() {
try {
    buyItem()
} catch (ex: Exception) {
    println(ex.message)
}


}

fun buyItem() {
    val isInStock = false

    if (isInStock) {
        // buying item
    } else {
        // exception
        throw Exception("item not in stock exception")
    }
}