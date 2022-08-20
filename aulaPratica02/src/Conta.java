public abstract class Conta {

    private Integer numero;
    private Float saldo;

    public Conta(Integer numero, Float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public void creditaSaldo(float valorCreditado){
        this.setSaldo(saldo += valorCreditado);
    }

    public boolean debitaSaldo(float valorDebitado){
        if(valorDebitado > this.saldo){
            return false;
        } else {
            this.setSaldo(saldo -= valorDebitado);
            return true;
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Numero=" + numero +
                ", Saldo=" + saldo +
                '}';
    }
}

