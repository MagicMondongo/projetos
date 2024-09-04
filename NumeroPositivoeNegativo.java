 import java.util.Scanner;

    public class NumeroPositivoeNegativo {
        public static void main(String[] args) {
            // Cria um Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário para inserir um número
            System.out.print("Digite um número: ");
            // Lê o número inserido pelo usuário
            double numero = scanner.nextDouble();

            // Fecha o scanner
            scanner.close();

            // Verifica se o número é positivo, negativo ou zero
            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        }
    }

