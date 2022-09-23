public class Principal {
    public static void main(String[] args) {

        Sorvete sorv1 = SorveteFactory.get(0);
        System.out.println(sorv1.fazerSorvete());

        Sorvete sorv2 = SorveteFactory.get(1);
        System.out.println(sorv2.fazerSorvete());

        Sorvete sorv3 = SorveteFactory.get(2);
        System.out.println(sorv3.fazerSorvete());


    }
}
