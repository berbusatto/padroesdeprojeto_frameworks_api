public class PorItem extends Empregado{
    private double valorProducao;
    private int quantidade;

    public PorItem(String nome, String email, int anoContratacao, float valorProducao, int quantidade) {
        super(nome, email, anoContratacao);
        this.valorProducao = valorProducao;
        this.quantidade = quantidade;
    }

    public PorItem(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PorItem{" +
                "valorProducao=" + valorProducao +
                ", quantidade=" + quantidade +
                "} " + super.toString();
    }

    @Override
    public double calculaSalario() {
        return this.getQuantidade() * this.getValorProducao();
    }


}
