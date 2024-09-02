interface Combatant {
    fun attack(opponent: Character): Int
    fun defend(damage: Int): Int
    fun heal(): Int
}
