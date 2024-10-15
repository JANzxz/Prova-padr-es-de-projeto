import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros_disponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros_disponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros_disponiveis.add(livro);
        System.out.println("Livro adicionado: " + livro.getNome());
    }

    public void mostrarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na " + nome + ":");
        for (Livro livro : livros_disponiveis) {
            System.out.println("- " + livro.getNome());
        }
    }
}