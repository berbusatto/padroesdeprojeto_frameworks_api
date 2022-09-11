public class PorItem extends Empregado{
    private float valorProducao;
    private int quantidade;

    public PorItem(String nome, String email, int anoContratacao, float valorProducao, int quantidade) {
        super(nome, email, anoContratacao);
        this.valorProducao = valorProducao;
        this.quantidade = quantidade;
    }

    public PorItem(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }
    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
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
    public float calculaSalario() {
        return this.getQuantidade() * this.getValorProducao();
    }


}
