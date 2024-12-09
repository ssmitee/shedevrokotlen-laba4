fun main() {
    val n = readln().toInt() // Число вводимых строк
    val wordCounts = mutableMapOf<String, Int>() // Map для подсчета слов

    repeat(n) {
        val words = readln().split(" ") // Разделяем строку на слова
        for (word in words) {
            wordCounts[word] = wordCounts.getOrDefault(word, 0) + 1
        }
    }

    // Сортируем слова по алфавиту и выводим результат
    wordCounts.toSortedMap().forEach { (word, count) ->
        println("$word: $count")
    }
}

//тут надо сначала ввести циферку твоих строк
//а потом написать чёто,ну шоб были одинаковые слова
//потом будет вывод скоко слов будет написано вроде так
//Андрей Валентинович не ставьте двойку