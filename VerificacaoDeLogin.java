import java.util.Scanner;

public class VerificacaoDeLogin {
    public static void main(String[] args) {
        // 1. Crie duas variáveis para armazenar o nome de usuário e a senha corretos
        String usuarioCorreto = "Usuario";
        String senhaCorreta = "4532";

        // 2. Peça ao usuário para inserir um nome de usuário e uma senha
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuarioInserido = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.nextLine();

        // 3. Verifique se o nome de usuário e a senha inseridos correspondem aos valores corretos
        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            // 4. Imprima uma mensagem de sucesso ou de erro, dependendo da validação
            System.out.println("Login bem-sucedido! Bem-vindo, " + usuarioInserido + "!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
