interface GameInterface {
    fun play()
}

class Game(val hero: Hero, val enemy: Enemy) : GameInterface {
    override fun play() {
        println("The battle begins between ${hero.name} and ${enemy.name}!")

        while (hero.isAlive() && enemy.isAlive()) {
            takeTurn(hero, enemy)
            if (enemy.isAlive()) {
                takeTurn(enemy, hero)
            }
        }

        if (hero.isAlive()) {
            println("${hero.name} won the battle!")
        } else {
            println("${enemy.name} won the battle!")
        }

    }

    private fun takeTurn(combatant: Combatant, opponent: Character) {
        when ((1..3).random()) {
            1 -> {
                val damage = combatant.attack(opponent)
                opponent.defend(damage)
            }
            2 -> combatant.defend(opponent.attack(combatant as Character))
            3 -> combatant.heal()
        }
    }
}
