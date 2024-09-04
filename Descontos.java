import java.util.Scanner;

public class Descontos {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Inicializa as variáveis de desconto e valor final
        double desconto = 0.0;
        double valorFinal;

        // Aplica as regras de desconto progressivo
        if (valorCompra > 500) {
            desconto = 0.20; // 20% de desconto
        } else if (valorCompra >= 200) {
            desconto = 0.10; // 10% de desconto
        } else if (valorCompra >= 100) {
            desconto = 0.05; // 5% de desconto
        } else {
            desconto = 0.00; // Sem desconto
        }

        // Calcula o valor descontado e o valor final da compra
        double valorDescontado = valorCompra * desconto;
        valorFinal = valorCompra - valorDescontado;

        // Fecha o scanner
        scanner.close();

        // Exibe os resultados
        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Percentual de desconto aplicado: %.0f%%%n", desconto * 100);
        System.out.printf("Valor descontado: R$ %.2f%n", valorDescontado);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
    }
}
