public class Transmissao {

    private String tipo;
    private int quantMarchas;

    @Override
    public String toString() {
        return "Transmissao{" +
                "tipo='" + tipo + '\'' +
                ", quantMarchas=" + quantMarchas +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantMarchas() {
        return quantMarchas;
    }

    public void setQuantMarchas(int quantMarchas) {
        this.quantMarchas = quantMarchas;
    }
}
