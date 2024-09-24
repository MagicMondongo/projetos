import java.util.Scanner;

public class SolicitaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        // Laço de repetição até que uma idade válida seja fornecida
        while (idade <= 0) {
            System.out.print("Por favor, insira sua idade ): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        }

        System.out.println("Idade registrada: " + idade);
        scanner.close();
    }
}
