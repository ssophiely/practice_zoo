class Animal(val type: String, val age: Int, val name: String, val area: NaturalArea, val cost: Double) {
    override fun toString(): String {
        return "Вид: $name, возраст: $age, имя: $name, природная зона: ${area.name}\n"
    }
}