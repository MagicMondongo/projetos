import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC extends JFrame implements ActionListener {

    private JTextField campoPeso, campoAltura;
    private JLabel labelResultado;

    public CalculadoraIMC() {

        setTitle("Calculadora de IMC");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
        setResizable(false);


        JLabel labelPeso = new JLabel("Peso (kg):");
        campoPeso = new JTextField();

        JLabel labelAltura = new JLabel("Altura (m):");
        campoAltura = new JTextField();

        JButton botaoCalcular = new JButton("Calcular IMC");
        botaoCalcular.addActionListener(this);

        labelResultado = new JLabel("Resultado: --", SwingConstants.CENTER);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 14));


        add(labelPeso);
        add(campoPeso);
        add(labelAltura);
        add(campoAltura);
        add(new JLabel());
        add(botaoCalcular);
        add(new JLabel());
        add(labelResultado);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try {

            double peso = Double.parseDouble(campoPeso.getText().trim());
            double altura = Double.parseDouble(campoAltura.getText().trim());


            if (peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(this, "Peso e altura devem ser maiores que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }


            double imc = peso / (altura * altura);


            String categoria;
            if (imc < 18.5) {
                categoria = "Baixo Peso";
            } else if (imc < 24.9) {
                categoria = "Peso Normal";
            } else if (imc < 29.9) {
                categoria = "Sobrepeso";
            } else {
                categoria = "Obesidade";
            }


            labelResultado.setText(String.format("IMC: %.2f | Categoria: %s", imc, categoria));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraIMC();
    }
}