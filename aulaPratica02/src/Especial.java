public class Especial extends Conta{


    public float limite;

    public Especial(int numero, float saldo, float limite){
        super(numero, saldo);
        this.limite = limite;
    }
    public Especial(){

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
