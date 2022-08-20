package ex08;

public class Midia extends Produto{
    public String artista;

    public Midia(int cod, float pre, String artista) {
        super(cod, pre);
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "artista='" + artista + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                "} " + super.toString();
    }

    @Override
    public float calculaFrete() {
        return (float)(this.preco * 0.05);
    }
}
