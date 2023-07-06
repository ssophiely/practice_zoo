class Animal(val type: String, var age: Int, val name: String, val area: NaturalArea, var cost: Int) {
    override fun toString(): String {
        return "Вид: $type, возраст: $age, имя: $name, природная зона: ${area.n}, затраты на корм за день: $cost\n"
    }
}