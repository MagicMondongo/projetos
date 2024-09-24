import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicializa variáveis
        int fatorial = 1;
        int i = 1;

        // Calcula o fatorial usando um loop do-while
        do {
            fatorial *= i; // Multiplica o fatorial pelo contador
            i++; // Incrementa o contador
        } while (i <= numero);

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // Fecha o scanner
        scanner.close();
    }
}
