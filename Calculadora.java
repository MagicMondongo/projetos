import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField tela;
    private String operador;
    private double valor1, valor2;

    public Calculadora() {

        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        tela = new JTextField();
        tela.setFont(new Font("Arial", Font.BOLD, 24));
        tela.setHorizontalAlignment(JTextField.RIGHT);
        tela.setEditable(false);
        add(tela, BorderLayout.NORTH);


        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 5, 5));


        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 18));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();


        if (comando.matches("\\d")) {
            tela.setText(tela.getText() + comando);
        }

        else if (comando.equals("C")) {
            tela.setText("");
            valor1 = valor2 = 0;
            operador = null;
        }

        else if (comando.equals("=")) {
            if (operador != null && !tela.getText().isEmpty()) {
                valor2 = Double.parseDouble(tela.getText());
                double resultado = 0;

                switch (operador) {
                    case "+":
                        resultado = valor1 + valor2;
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        break;
                    case "/":
                        if (valor2 != 0) {
                            resultado = valor1 / valor2;
                        } else {
                            JOptionPane.showMessageDialog(this, "Divisão por zero não permitida!");
                            tela.setText("");
                            return;
                        }
                        break;
                }
                tela.setText(String.valueOf(resultado));
                operador = null;
            }
        }

        else {
            if (!tela.getText().isEmpty()) {
                valor1 = Double.parseDouble(tela.getText());
                operador = comando;
                tela.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
