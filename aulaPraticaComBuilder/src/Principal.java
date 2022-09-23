public class Principal {
    public static void main(String[] args) {
        BuilderEsportivo carroEsportivo = new BuilderEsportivo();
        carroEsportivo.setGpsMarca("Philco");
        carroEsportivo.setGpsModelo("PH-XC136");
        carroEsportivo.setMotoKilometragem(35042);
        carroEsportivo.setMotorPotencia(487);
        carroEsportivo.setMotorVolume(3600);
        carroEsportivo.setTransmissaoQuantMarchas(7);

        Carro esportivo = carroEsportivo.get();

        System.out.println(esportivo.toString());

        esportivo.getMotor().andar(10);
        esportivo.getMotor().ligar();
        esportivo.getMotor().andar(1000);

        System.out.println(esportivo.toString());


        BuilderSUV carroSUV = new BuilderSUV();
        carroSUV.setGpsMarca("Logitech");
        carroSUV.setGpsModelo("L32789");
        carroSUV.setMotoKilometragem(156631);
        carroSUV.setMotorPotencia(121);
        carroSUV.setMotorVolume(1800);

        Carro suv = carroSUV.get();

        System.out.println(suv.toString());
    }
}
