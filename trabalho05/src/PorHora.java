public class PorHora extends Empregado{
    private float porHora;
    private float quantHoras;

    public PorHora(String nome, String email, int anoContratacao, float porHora, float quantHoras) {
        super(nome, email, anoContratacao);
        this.porHora = porHora;
        this.quantHoras = quantHoras;
    }
    public PorHora(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }


    public float getPorHora() {
        return porHora;
    }

    public void setPorHora(float porHora) {
        this.porHora = porHora;
    }

    public float getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(float quantHoras) {
        this.quantHoras = quantHoras;
    }

    @Override
    public String toString() {
        return "PorHora{" +
                "porHora=" + porHora +
                ", quantHoras=" + quantHoras +
                "} " + super.toString();
    }

    @Override
    public float calculaSalario() {
        return this.getPorHora() * this.getQuantHoras();
    }


}
