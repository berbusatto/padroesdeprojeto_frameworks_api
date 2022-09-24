public class PorHora extends Empregado{
    private double porHora;
    private double quantHoras;

    public PorHora(String nome, String email, int anoContratacao, float porHora, float quantHoras) {
        super(nome, email, anoContratacao);
        this.porHora = porHora;
        this.quantHoras = quantHoras;
    }
    public PorHora(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }


    public double getPorHora() {
        return porHora;
    }

    public void setPorHora(double porHora) {
        this.porHora = porHora;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
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
    public double calculaSalario() {
        return this.getPorHora() * this.getQuantHoras();
    }


}
