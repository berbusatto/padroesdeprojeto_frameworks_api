public class Especial extends Conta{


    public float limite;

    public Especial(int numero, float saldo, float limite){
        super(numero, saldo);
        this.limite = limite;
    }
    public Especial(){

    }
    @Override
    public boolean debitaSaldo(float valorDebitado){
       boolean aux = valorDebitado > (this.getSaldo() + this.getLimite());
            if(!aux){
                 this.setSaldo(getSaldo() - valorDebitado);
            }
        return aux;
    }
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Especial{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
