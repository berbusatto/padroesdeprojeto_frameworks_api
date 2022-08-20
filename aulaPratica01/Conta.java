package aulaPratica01;

public class Conta{
    private float saldo;
    private int numero;

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

    public void debitaSaldo(float debito){
        this.saldo -= debito;
    }

    public void creditaSaldo(float credito){
        this.saldo += credito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
