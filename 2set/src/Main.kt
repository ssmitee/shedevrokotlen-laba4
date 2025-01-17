fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val strikeDays = mutableSetOf<Int>() // Используем Set для уникальных дней забастовок

    repeat(k) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        var day = a
        while (day <= n) {
            // Проверяем, что день не выпадает на выходной (суббота или воскресенье)
            if (day % 7 != 6 && day % 7 != 0) { // 6-й и 7-й дни (суббота и воскресенье)
                strikeDays.add(day)
            }
            day += b
        }
    }

    println(strikeDays.size) // Количество уникальных дней забастовок
}






//когда консоль будет что вводить:
//1 количество дней и скока партий есть (2)
//для 1 партии пишу 1 день,когда партия объявляет бунд и периодичность(ну так каждые 2-3 дня)
// для 2 второй партии почти аналогично а по дня там допустим каждые 4 дня начиная с 3 дня