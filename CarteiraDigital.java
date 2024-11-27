import java.util.ArrayList;
import java.util.Scanner;

class CarteiraDigital {
    private double saldo;
    private ArrayList<String> historico;


    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }


    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Adicionado: R$ " + valor);
            System.out.println("R$ " + valor + " adicionados com sucesso!");
        } else {
            System.out.println("O valor para adicionar deve ser positivo!");
        }
    }


    public void realizarPagamento(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            historico.add("Pago: R$ " + valor);
            System.out.println("Pagamento de R$ " + valor + " realizado com sucesso!");
        } else if (valor <= 0) {
            System.out.println("O valor para pagamento deve ser positivo!");
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento!");
        }
    }


    public double verificarSaldo() {
        return saldo;
    }


    public void historicoTransacoes() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação realizada ainda.");
        } else {
            System.out.println("Histórico de Transações:");
            for (String transacao : historico) {
                System.out.println("- " + transacao);
            }
        }
    }
}

