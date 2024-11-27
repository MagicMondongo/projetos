import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroDeContatos extends JFrame implements ActionListener {

    private JTextField campoNome, campoTelefone, campoEmail;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaContatos;
    private ArrayList<String> contatos;

    public CadastroDeContatos() {

        setTitle("Cadastro de Contatos");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        contatos = new ArrayList<>();
        modeloLista = new DefaultListModel<>();


        JPanel painelSuperior = new JPanel(new GridLayout(4, 2, 5, 5));
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField();
        JLabel labelTelefone = new JLabel("Telefone:");
        campoTelefone = new JTextField();
        JLabel labelEmail = new JLabel("E-mail:");
        campoEmail = new JTextField();

        painelSuperior.add(labelNome);
        painelSuperior.add(campoNome);
        painelSuperior.add(labelTelefone);
        painelSuperior.add(campoTelefone);
        painelSuperior.add(labelEmail);
        painelSuperior.add(campoEmail);

        JButton botaoAdicionar = new JButton("Adicionar Contato");
        botaoAdicionar.addActionListener(this);

        painelSuperior.add(botaoAdicionar);

        add(painelSuperior, BorderLayout.NORTH);


        listaContatos = new JList<>(modeloLista);
        listaContatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollLista = new JScrollPane(listaContatos);
        add(scrollLista, BorderLayout.CENTER);


        JPanel painelInferior = new JPanel();
        JButton botaoRemover = new JButton("Remover Contato");
        botaoRemover.addActionListener(this);
        painelInferior.add(botaoRemover);

        add(painelInferior, BorderLayout.SOUTH);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Adicionar Contato")) {
            adicionarContato();
        } else if (comando.equals("Remover Contato")) {
            removerContato();
        }
    }

    private void adicionarContato() {
        String nome = campoNome.getText().trim();
        String telefone = campoTelefone.getText().trim();
        String email = campoEmail.getText().trim();

        if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String contato = String.format("Nome: %s | Telefone: %s | E-mail: %s", nome, telefone, email);
        contatos.add(contato);
        modeloLista.addElement(contato);


        campoNome.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
    }

    private void removerContato() {
        int indiceSelecionado = listaContatos.getSelectedIndex();
        if (indiceSelecionado == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um contato para remover!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        contatos.remove(indiceSelecionado);
        modeloLista.remove(indiceSelecionado);
    }

    public static void main(String[] args) {
        new CadastroDeContatos();
    }
}