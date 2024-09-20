public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    // Getters e setters
}

public class Empréstimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    // Getters e setters
}

public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    // Getters e setters
}

import javax.swing.*;

public class InterfaceGrafica {

    private JFrame frame;
    private JPanel panel;
    private JButton btnCadastrarLivro;
    private JButton btnCadastrarUsuario;
    private JButton btnRealizarEmprestimo;
    private JButton btnDevolverLivro;
    private JButton btnListarLivros;
    private JButton btnListarUsuarios;
    private JButton btnListarEmprestimos;

    public InterfaceGrafica() {
        frame = new JFrame("Sistema de Gerenciamento de Empréstimos de Livros");
        panel = new JPanel();

        // Criar botões e adicionar ao painel
        btnCadastrarLivro = new JButton("Cadastrar Livro");
        panel.add(btnCadastrarLivro);

        // ...

        // Adicionar painel ao frame e exibir
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // Métodos para lidar com eventos de botão
}