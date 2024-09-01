import java.util.Scanner;

public class VerificacaoDiasDaSemana {
    public static void main(String[] args) {
        // Criar scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número de 1 a 7
        System.out.print("Digite um número (1-7) para verificar o dia da semana: ");
        int dia = scanner.nextInt();

        // Usar switch para verificar o dia da semana
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
        }

        // Fechar o scanner
        scanner.close();
    }
}