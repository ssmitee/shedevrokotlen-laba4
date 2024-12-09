//lab4 1-list
fun swapAdjacentElements(list: List<Int>): List<Int> {
    return List(list.size) { index ->
        if (index % 2 == 0 && index + 1 < list.size) {
            list[index + 1] // если индекс четный, берем следующий элемент
        } else if (index % 2 == 1) {
            list[index - 1] // если индекс нечетный, берем предыдущий элемент
        } else {
            list[index] // если это последний элемент (или нечетный индекс в четном списке), оставляем его как есть
        }
    }
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = swapAdjacentElements(list)
    println(result)  // [2, 1, 4, 3, 5]
}
