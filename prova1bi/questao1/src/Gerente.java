public class Gerente extends Empregado{
    private double salario;

    public Gerente(String nome, String email, int anoContratacao) {

        super(nome, email, anoContratacao);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                "} " + super.toString();
    }

    @Override
    public double calculaSalario() {
        return this.salario;
    }
}
