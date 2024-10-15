import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Livro> livros_emprestados;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Usuario(String nome) {
        this.nome = nome;
        this.livros_emprestados = new ArrayList<>();
    }
    public void pegando_emprestado(Livro livro){
        livros_emprestados.add(livro);
        System.out.println(nome + " levou emprestado: " + livro.nome);
    }

    public void devolvendo(Livro livro) {
        if (livros_emprestados.remove(livro)) { // Remove o livro da lista de emprestados
            System.out.println(nome + " devolveu: " + livro.nome);
        } else {
            System.out.println(nome + " não tem esse livro emprestado.");
        }
    }
    public void mostrar_livros() {
        if (livros_emprestados.isEmpty()) {
            System.out.println(nome + " não tem livros emprestados.");
        } else {
            System.out.println(nome + " tem os seguintes livros emprestados:");
            for (Livro livro : livros_emprestados) {
                System.out.println("- " + livro.nome);
            }
        }
    }
}


//