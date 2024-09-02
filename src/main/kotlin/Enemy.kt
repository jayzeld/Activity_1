class Enemy(name: String, hp: Int, def: Int) : Character(name, hp, def), Combatant {
    override fun attack(opponent: Character): Int {
        return super.attack(opponent)
    }

    override fun defend(damage: Int): Int {
        return super.defend(damage)
    }

    override fun heal(): Int {
        return super.heal()
    }
}
