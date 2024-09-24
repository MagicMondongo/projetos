import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inicial
        System.out.print("Digite um número inicial para a contagem regressiva: ");
        int numero = scanner.nextInt();

        // Faz a contagem regressiva até 0
        while (numero >= 0) {
            System.out.println(numero);
            numero--; // Decrementa o número
        }

        // Fecha o scanner
        scanner.close();
    }
}
