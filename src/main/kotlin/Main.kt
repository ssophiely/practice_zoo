fun main() {
    val zoo1 = Zoo(
        mutableListOf(
            Animal("Лев", 8, "Лео", NaturalArea.SAVANNA, 2000),
            Animal("Слон", 5, "Джим", NaturalArea.SAVANNA, 1200),
            Animal("Пингвин", 12, "Рикко", NaturalArea.ARCTIC, 300),
            Animal("Волк", 7, "Аура", NaturalArea.TUNDRA, 500),
            Animal("Полярная сова", 10, "Букля", NaturalArea.TUNDRA, 300),
            Animal("Полярная сова", 1, "Локи", NaturalArea.TUNDRA, 200)
        )
    )
    val zoo2 = Zoo(
        mutableListOf(
            Animal("Лев", 3, "Ричард", NaturalArea.SAVANNA, 1500),
            Animal("Верблюд", 25, "Джим", NaturalArea.DESERT, 500),
            Animal("Змея", 5, "Медуза", NaturalArea.DESERT, 300),
            Animal("Тигр", 7, "Герда", NaturalArea.RAINFOREST, 2000),
            Animal("Горилла", 10, "Коко", NaturalArea.RAINFOREST, 1000),
            Animal("Полярная сова", 5, "Филя", NaturalArea.TUNDRA, 300),
            Animal("Жираф", 10, "Дамми", NaturalArea.SAVANNA, 500),
            Animal("Белый медведь", 3, "Умка", NaturalArea.ARCTIC, 800),
        )
    )
    val parrot = Animal("Попугай", 20, "Роберт", NaturalArea.RAINFOREST, 300)
    zoo2 += parrot
    val zoo3 = zoo1 + zoo2

    println("Зоопарк zoo1:\n${zoo1}")
    println("\nЗоопарк zoo2:\n${zoo2}")
    println("\nКоличество животных в zoo3: ${-zoo3}")
    println("Зоопарк zoo3:\n${zoo3}")
    println("\nПоиск по имени Герда:\n${(zoo3 findByName "Герда").joinToString("\n")}")
    println("\nПоиск по виду полярная сова:\n${(zoo3 findByType "Полярная сова").joinToString("\n")}")
    println(
        "\nФильтрация животных (природная зона - саванна):\n${
            (zoo3.filterBy { an: Animal -> an.area.habitat == "Саванна" }).joinToString(
                "\n"
            )
        }"
    )
    println("\nРасчет затрат за месяц по саванне: ${zoo3.calculateFoodPerMonth("Саванна")}")
    println("\nДанные о животном изменены:\n${zoo3.modifyAnimal(2) { an: Animal -> an.cost = 1300 }}")
    println(
        "\nФильтрация животных (возраст > 5):\n${
            (zoo3.filterBy { an: Animal -> an.age > 5 }).joinToString("\n")
        }"
    )
}