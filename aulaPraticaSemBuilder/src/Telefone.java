public class Telefone {
    private int ddd, numero;
    private String tipo;

    public Telefone(int ddd, int numero, String tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
