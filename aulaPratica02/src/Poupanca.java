public class Poupanca extends Conta{

    public int aniversario;

    public Poupanca(int aniversario){
        this.aniversario = aniversario;
    }

    public Poupanca(Integer numero, Float saldo, int aniversario) {
        super(numero, saldo);
        this.aniversario = aniversario;
    }

    public Poupanca(){

    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Poupanca{" +
                "aniversario=" + aniversario +
                "} " + super.toString();
    }
}
