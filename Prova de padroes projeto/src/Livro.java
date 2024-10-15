public class Livro {

    public String nome;
    public String autor;
    public int ano;
    public int ano_de_publicacao;

    public Livro(String nome, String autor, int ano, int ano_de_publicacao) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.ano_de_publicacao = ano_de_publicacao;
    }

    public String getNome() {
        return nome;
    }

    public void mostrar_informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Ano de publicação: " + ano_de_publicacao);
    }
}
