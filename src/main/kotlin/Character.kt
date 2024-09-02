open class Character(val name: String, var hp: Int, var def: Int) {
    open fun attack(opponent: Character): Int {
        val damage = (10..20).random()
        println("$name attacks ${opponent.name} and deals $damage damage!")
        return damage
    }

    open fun defend(damage: Int): Int {
        val reducedDamage = damage - def
        hp -= if (reducedDamage > 0) reducedDamage else 0
        println("$name defends and reduces damage to $reducedDamage. HP is now $hp.")
        return reducedDamage
    }

    open fun heal(): Int {
        val healAmount = (5..15).random()
        hp += healAmount
        println("$name heals for $healAmount HP. HP is now $hp.")
        return healAmount
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}
