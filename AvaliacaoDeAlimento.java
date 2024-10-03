import java.util.Scanner;

public class AvaliacaoDeAlimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alinhamentos: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade deve ser um número positivo.");
            return;
        }

        double[] avaliacoes = new double[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Digite a nota para o alinhamento " + (i + 1) + " (0 a 10): ");
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    avaliacoes[i] = nota;
                    break;
                } else {
                    System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
                }
            }
        }

        double soma = 0;
        for (double nota : avaliacoes) {
            soma += nota;
        }
        double media = soma / n;

        // Conta as avaliações boas e ruins
        int bons = 0;
        int ruins = 0;

        for (double nota : avaliacoes) {
            if (nota >= 6) {
                bons++;
            } else {
                ruins++;
            }
        }

        System.out.printf("\nMédia das avaliações: %.2f\n", media);
        System.out.println("Quantidade de alinhamentos avaliados como bons (nota >= 6): " + bons);
        System.out.println("Quantidade de alinhamentos avaliados como ruins (nota < 6): " + ruins);

        scanner.close();
    }
}