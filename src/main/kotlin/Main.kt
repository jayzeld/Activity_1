fun getInput(prompt: String, default: String): String {
    println(prompt)
    val input = readLine()?.trim()
    return if (input.isNullOrEmpty()) default else input
}

fun main() {
    val heroName = getInput("Enter the name of your Hero:", "")
    val enemyName = getInput("Enter the name of your Enemy:", "")

    val hero = Hero(heroName, hp = 80, def = 7)
    val enemy = Enemy(enemyName, hp = 100, def = 5)

    val game = Game(hero, enemy)
    game.play()
}
