public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Bom Ler");

        Livro livro1 = new Livro("Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 1943);
        Livro livro2 = new Livro("1984", "George Orwell", 1949, 1949);
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.mostrarLivrosDisponiveis();

        Usuario usuario = new Usuario("João");

        usuario.pegando_emprestado(livro1);
        usuario.mostrar_livros();

        usuario.devolvendo(livro1);
        usuario.mostrar_livros();

        biblioteca.mostrarLivrosDisponiveis();
    }
}