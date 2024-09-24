import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número n
        System.out.print("Digite a quantidade de números que você deseja inserir: ");
        int n = scanner.nextInt();

        // Inicializa a soma dos números
        double soma = 0;

        // Laço de repetição para coletar os números
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;  // Adiciona o número à soma
        }

        // Calcula a média
        double media = soma / n;

        // Exibe a média
        System.out.printf("A média dos %d números é: %.2f%n", n, media);

        scanner.close(); // Fecha o scanner
    }
}
