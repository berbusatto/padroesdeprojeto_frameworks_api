public class Motor {

    private double volume;
    private int potencia;
    private double kilometragem;
    private boolean ligado;

    public void andar(double distancia){
        if(ligado){
            this.kilometragem+=distancia;
        } else{
            System.out.println("Ligar o carro!");
        }

    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public boolean estaLigado(){
        return this.ligado;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "volume=" + volume +
                ", potencia=" + potencia +
                ", kilometragem=" + kilometragem +
                ", ligado=" + ligado +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }
}
