class Zoo(val animalList: MutableList<Animal>) {
    operator fun unaryMinus(): Int {
        return animalList.size
    }

    operator fun plus(other: Zoo): Zoo {
        return Zoo(animalList.plus(other.animalList) as MutableList<Animal>)
    }

    infix fun findByName(_name: String): List<Animal> {
        return animalList.filter { it.name == _name }
    }

    infix fun findByType(_type: String): List<Animal> {
        return animalList.filter { it.type == _type }
    }

    fun calculateFoodPerMonth(habitat: String): Int {
        return animalList.filter { it.area.habitat == habitat }.sumOf { it.cost * 30 }

    }

    fun modifyAnimal(index: Int, func: (an: Animal) -> Unit): String {
        func(animalList[index - 1])
        return animalList[index - 1].toString()
    }

    override fun toString(): String {
        return animalList.joinToString("\n")
    }
}

operator fun Zoo.plusAssign(other: Animal) {
    animalList.add(other)
}

fun Zoo.filterBy(lambda: (Animal) -> Boolean): List<Animal> {
    return animalList.filter(lambda)
}