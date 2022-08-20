package ex08;

public class Livro extends Produto{
    public String autor;
    public String editora;
    public int paginas;

    public Livro(int cod, float pre, String autor, String editora, int paginas) {
        super(cod, pre);
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginas=" + paginas +
                "} " + super.toString();
    }

    @Override
    public float calculaFrete() {
        return (float)(this.preco * 0.07);
    }
}
