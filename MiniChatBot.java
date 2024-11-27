import java.util.Scanner;

public class MiniChatBot {


    private String nome = "MiniChatbot";


    public String responderSaudacao() {
        return "Olá! Como posso ajudar você hoje?";
    }

    public String responderNome() {
        return "Meu nome é " + nome + ". Em que posso ajudar você?";
    }

    public String responderEstado() {
        return "Estou funcionando perfeitamente, obrigado por perguntar!";
    }

    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    public String encerrarConversa() {
        return "Até logo! Foi bom conversar com você.";
    }


    public String processarMensagem(String mensagem) {
        mensagem = mensagem.toLowerCase(); // Converte para minúsculas para facilitar a verificação

        if (mensagem.contains("ola") || mensagem.contains("oi") || mensagem.contains("bom dia") || mensagem.contains("boa tarde")) {
            return responderSaudacao();
        } else if (mensagem.contains("qual e o seu nome") || mensagem.contains("seu nome")) {
            return responderNome();
        } else if (mensagem.contains("como voce esta") || mensagem.contains("tudo bem")) {
            return responderEstado();
        } else if (mensagem.contains("sair")) {
            return null; // Indica o fim da conversa
        } else {
            return respostaPadrao();
        }
    }


    public static void main(String[] args) {
        MiniChatBot bot = new MiniChatBot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("MiniChatbot: Olá! Eu sou o MiniChatbot. Digite 'sair' para encerrar a conversa.");

        while (true) {
            System.out.print("Você: ");
            String entradaUsuario = scanner.nextLine();
            String resposta = bot.processarMensagem(entradaUsuario);

            if (resposta == null) { // Se a resposta for null, encerra a conversa
                System.out.println("MiniChatbot: " + bot.encerrarConversa());
                break;
            } else {
                System.out.println("MiniChatbot: " + resposta);
            }
        }

        scanner.close();
    }
}