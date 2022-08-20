package ex08;

public abstract class Produto {
    public int codigo;
    public float preco;

    public Produto(int cod, float pre){
        this.codigo = cod;
        this.preco = pre;
    }
    public abstract float calculaFrete();
}
