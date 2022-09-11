public class Gerente extends Empregado{
    private float salario;

    public Gerente(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                "} " + super.toString();
    }

    @Override
    public float calculaSalario() {
        return this.salario;
    }
}
