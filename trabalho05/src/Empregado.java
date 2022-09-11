import java.time.LocalDate;

public abstract class Empregado {
    private String nome;
    private String email;
    private int anoContratacao;

    public int tempoCasa(){
        LocalDate data_local = LocalDate.now();
        int anoAtual = data_local.getYear();
        return anoAtual - this.getAnoContratacao();
    }
    public abstract float calculaSalario();

    public Empregado(String nome, String email, int anoContratacao) {
        this.nome = nome;
        this.email = email;
        this.anoContratacao = anoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", anoContratacao=" + anoContratacao +
                '}';
    }
}

