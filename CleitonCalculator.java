import java.util.Scanner;

public class CleitonCalculator {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Variável para armazenar o resultado
        double resultado = 0;

        // Condições para verificar a operação e realizar o cálculo
        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Operação inválida.");
            scanner.close();
            return;
        }

        // Exibe o resultado da operação
        System.out.println("O resultado é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}


