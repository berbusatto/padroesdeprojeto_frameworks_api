package pr.senac.br.aula08API.models;

public class Operacao {
    private double operando1, operando2;
    private char operador;

    public double soma(){
        return this.operando1 + this.operando2;
    }

    public double subtracao(){
        return this.operando1 - this.operando2;
    }

    public double multiplicacao(){
        return this.operando1 * this.operando2;
    }

    public double divisao(){
        return this.operando1 / this.operando2;
    }

    public Operacao(double operando1, double operando2, char operador) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
    }

    public Operacao() {
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
}
