import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AplicativoDeNotas extends JFrame implements ActionListener {

    private JTextField campoNota;
    private JTextArea areaNotas;
    private JLabel labelResultado;
    private ArrayList<Double> notas;

    public AplicativoDeNotas() {

        setTitle("Aplicativo de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        notas = new ArrayList<>();


        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new FlowLayout());

        JLabel labelNota = new JLabel("Nota:");
        campoNota = new JTextField(10);
        JButton botaoAdicionar = new JButton("Adicionar Nota");
        botaoAdicionar.addActionListener(this);

        painelSuperior.add(labelNota);
        painelSuperior.add(campoNota);
        painelSuperior.add(botaoAdicionar);

        add(painelSuperior, BorderLayout.NORTH);


        areaNotas = new JTextArea();
        areaNotas.setEditable(false);
        areaNotas.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollNotas = new JScrollPane(areaNotas);
        add(scrollNotas, BorderLayout.CENTER);


        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new GridLayout(2, 1));

        JButton botaoCalcular = new JButton("Calcular Média");
        botaoCalcular.addActionListener(this);

        labelResultado = new JLabel("Média: -- | Status: --", SwingConstants.CENTER);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));

        painelInferior.add(botaoCalcular);
        painelInferior.add(labelResultado);

        add(painelInferior, BorderLayout.SOUTH);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Adicionar Nota")) {
            try {
                double nota = Double.parseDouble(campoNota.getText());

                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(this, "A nota deve estar entre 0 e 10!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    notas.add(nota);
                    atualizarListaNotas();
                    campoNota.setText(""); // Limpa o campo de entrada
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (comando.equals("Calcular Média")) {
            if (notas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhuma nota foi adicionada!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                calcularMedia();
            }
        }
    }

    private void atualizarListaNotas() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < notas.size(); i++) {
            sb.append("Nota ").append(i + 1).append(": ").append(notas.get(i)).append("\n");
        }
        areaNotas.setText(sb.toString());
    }

    private void calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        String status = media >= 7.0 ? "Aprovado" : "Reprovado";

        labelResultado.setText(String.format("Média: %.2f | Status: %s", media, status));
    }

    public static void main(String[] args) {
        new AplicativoDeNotas();
    }
}
