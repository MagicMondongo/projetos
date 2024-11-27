import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar: R$ ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: R$ ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: R$ " + carteira.verificarSaldo());
                    break;

                case 4:
                    carteira.historicoTransacoes();
                    break;

                case 5:
                    System.out.println("Obrigado por usar o UniparCoins! Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }


    public static void exibirMenu() {
        System.out.println("\n=== UniparCoins ===");
        System.out.println("1. Adicionar Saldo");
        System.out.println("2. Realizar Pagamento");
        System.out.println("3. Verificar Saldo");
        System.out.println("4. Histórico de Transações");
        System.out.println("5. Sair");
    }
}