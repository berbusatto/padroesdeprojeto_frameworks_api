public class BuilderEsportivo implements Builder{

    private Carro carro;
    private Motor motor;
    private Transmissao transmissao;
    private Gps gps;

    public BuilderEsportivo(){
        this.carro = new Carro();
        this.carro.setTipo("esportivo");
        this.carro.setPortas(2);

        this.motor = new Motor();
        this.motor.desligar();

        this.transmissao = new Transmissao();
        this.transmissao.setTipo("Manual");

        this.gps = new Gps();

        this.carro.setMotor(motor);
        this.carro.setTransmissao(transmissao);
        this.carro.setGps(gps);

    }


    @Override
    public void setTipoCarro(String tipo) {
        this.carro.setTipo(tipo);
    }

    @Override
    public void setPortas(int portas) {
        this.carro.setPortas(portas);
    }

    @Override
    public void setCapacidadeTanque(double capacidadetanque) {
        this.carro.setCapacidadeTanque(capacidadetanque);
    }

    @Override
    public void setMotorVolume(double volume) {
        this.motor.setVolume(volume);
    }

    @Override
    public void setMotorPotencia(int potencia) {
        this.motor.setPotencia(potencia);

    }

    @Override
    public void setMotoKilometragem(int kilometragem) {
        this.motor.setKilometragem(kilometragem);
    }

    @Override
    public void setTransmissaoQuantMarchas(int quantMarchas) {
        this.transmissao.setQuantMarchas(quantMarchas);
    }

    @Override
    public void setGpsRota(String rota) {
        this.gps.setRota(rota);
    }

    @Override
    public void setGpsMarca(String marca) {
        this.gps.setMarca(marca);
    }

    @Override
    public void setGpsModelo(String modelo) {
        this.gps.setModelo(modelo);
    }

    public Carro get() {
        return this.carro;
    }
}
