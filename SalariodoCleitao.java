import java.util.Scanner;

public class SalariodoCleitao {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o salário bruto
        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Solicita o número de anos que o funcionário trabalhou na empresa
        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalho = scanner.nextInt();

        // Inicializa as variáveis de bônus e imposto
        double bonus = 0.0;
        double imposto = 0.0;

        // Aplica as regras de bonificação
        if (anosTrabalho > 10) {
            bonus = 0.10 * salarioBruto; // 10% de bônus
        } else if (anosTrabalho >= 5) {
            bonus = 0.05 * salarioBruto; // 5% de bônus
        } else {
            bonus = 0.00; // Sem bônus
        }

        // Aplica as regras de desconto de impostos
        if (salarioBruto > 5000) {
            imposto = 0.27 * salarioBruto; // 27% de imposto
        } else if (salarioBruto >= 3000) {
            imposto = 0.18 * salarioBruto; // 18% de imposto
        } else {
            imposto = 0.10 * salarioBruto; // 10% de imposto
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto + bonus - imposto;

        // Fecha o scanner
        scanner.close();

        // Exibe os resultados
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Bônus recebido: R$ %.2f%n", bonus);
        System.out.printf("Imposto descontado: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
    }
}
