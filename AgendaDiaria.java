import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendaDiaria extends JFrame implements ActionListener {

    private JTextField campoCompromisso;
    private JSpinner spinnerDataHora;
    private JTable tabelaCompromissos;
    private DefaultTableModel modeloTabela;

    public AgendaDiaria() {

        setTitle("Agenda Diária");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel painelSuperior = new JPanel(new FlowLayout());
        JLabel labelCompromisso = new JLabel("Compromisso:");
        campoCompromisso = new JTextField(20);

        JLabel labelDataHora = new JLabel("Data e Hora:");
        spinnerDataHora = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinnerDataHora, "dd/MM/yyyy HH:mm");
        spinnerDataHora.setEditor(editor);

        JButton botaoAdicionar = new JButton("Adicionar Compromisso");
        botaoAdicionar.addActionListener(this);

        painelSuperior.add(labelCompromisso);
        painelSuperior.add(campoCompromisso);
        painelSuperior.add(labelDataHora);
        painelSuperior.add(spinnerDataHora);
        painelSuperior.add(botaoAdicionar);

        add(painelSuperior, BorderLayout.NORTH);


        String[] colunas = {"Data e Hora", "Descrição"};
        modeloTabela = new DefaultTableModel(colunas, 0);
        tabelaCompromissos = new JTable(modeloTabela);
        JScrollPane scrollTabela = new JScrollPane(tabelaCompromissos);
        add(scrollTabela, BorderLayout.CENTER);


        JPanel painelInferior = new JPanel();
        JButton botaoRemover = new JButton("Remover Compromisso");
        botaoRemover.addActionListener(this);
        painelInferior.add(botaoRemover);

        add(painelInferior, BorderLayout.SOUTH);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Adicionar Compromisso")) {
            adicionarCompromisso();
        } else if (comando.equals("Remover Compromisso")) {
            removerCompromisso();
        }
    }

    private void adicionarCompromisso() {
        String compromisso = campoCompromisso.getText().trim();
        Date dataHora = (Date) spinnerDataHora.getValue();
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        if (compromisso.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira a descrição do compromisso!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


        modeloTabela.addRow(new Object[]{formatoDataHora.format(dataHora), compromisso});
        campoCompromisso.setText(""); // Limpa o campo de texto
    }

    private void removerCompromisso() {
        int linhaSelecionada = tabelaCompromissos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um compromisso para remover!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


        modeloTabela.removeRow(linhaSelecionada);
    }

    public static void main(String[] args) {
        new AgendaDiaria();
    }
}