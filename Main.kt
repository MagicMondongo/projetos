fun main() {
    menu()

}

private fun menu() {
    do {

        println("--- MENU ---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("0- SAIR")

        val opcao = readln().toInt()//validar
        var convidado: Convidado = Convidado()
        when (opcao) {
            1 -> { print("Cadastrando...")
            convidado = cadastrar() }
            2 ->  { print("Listando...")
                listar(convidado) }
            3 -> {
                print("Editar...")
            }
            4 -> {
                print("Excluindo...")
            }
            0 -> {
                print("Saindo.")
            }
        }

    } while (true)

    private fun cadastrar(): Convidado
    {
        /*var nome: String = ""
        var presente: String = ""
        var alimentar: String = ""*/
        //Instância
        var convidado = Convidado()

        print("Qual o seu nome?")
        val nome = readln()
        convidado.nome = readln()

        print("Qual vai ser o presente?")
        val presente = readln()
        convidado.presente = readln()

        print("Qual sua restrição alimentar?")
        val alimento = readln()
        convidado.alimentar = readln()
        return convidado

    }
    private fun listar(convidado: Convidado){
        print("Nome: ${convidado.nome} ;" +
                "Presente: ${convidado.presente} ;" +
                "Restrição: ${convidado.alimentar} ; " +
        "Vai ir para festa?: ${convidado.presenca} \n; ")

    }


private fun editar(){
    println("O convidado vai? S/N")
    val resposta = readln()
    when(resposta){
        "S"-> convidado.presenca = true
        "N"-> convidado.presenca = false
    }
}
private fun excluir(){
    convidado.nome = ""
    convidado.alimentar = ""
    convidado.presente = ""
    convidado.presenca = false
    println("Convidado excluido")
}
}