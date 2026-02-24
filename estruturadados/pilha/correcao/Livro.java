package estruturadados.pilha.correcao;

public class Livro {
    private String isbn;
    private String autor;
    private String anoLanca;
    private String nome;

    public Livro(String isbn, String autor, String anoLanca, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anoLanca = anoLanca;
        this.nome = nome;
    }

    public Livro() {
        super();
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoLanca() {
        return anoLanca;
    }

    public void setAnoLanca(String anoLanca) {
        this.anoLanca = anoLanca;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLanca='" + anoLanca + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
