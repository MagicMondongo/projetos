import kotlin.random.Random

fun main() {
    val opcoes = arrayOf("Pedra", "Papel", "Tesoura")

    fun computadorEscolhe(): String {
        return opcoes[Random.nextInt(opcoes.size)]
    }

    fun determinarVencedor(jogador: String, computador: String): String {
        return when {
            jogador == computador -> "Empate!"
            jogador == "Pedra" && computador == "Tesoura" -> "Você ganhou!"
            jogador == "Papel" && computador == "Pedra" -> "Você ganhou!"
            jogador == "Tesoura" && computador == "Papel" -> "Você ganhou!"
            else -> "Você perdeu!"
        }
    }

    println("Bem-vindo ao jogo de Pedra, Papel ou Tesoura!")
    println("Escolha uma opção: Pedra, Papel ou Tesoura")

    val jogadorEscolha = readLine()?.capitalize() ?: ""

    if (jogadorEscolha !in opcoes) {
        println("Escolha inválida. Tente novamente!")
        return
    }

    val computadorEscolha = computadorEscolhe()
    println("O computador escolheu: $computadorEscolha")

    val resultado = determinarVencedor(jogadorEscolha, computadorEscolha)
    println(resultado)
}