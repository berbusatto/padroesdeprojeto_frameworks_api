package singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton sing_01 = new Singleton();
        // O construtor é um método private, portanto não é acessível fora do getInstancia()

        Singleton sing_02 = Singleton.getInstancia();

        Singleton sing_03 = Singleton.getInstancia();

        if (sing_02 == sing_03){
            System.out.println("Objetos são iguais");
        } else {
            System.out.println("Objetos são diferentes");
        }

        // Os objetos são iguais, pois o construtor aponta novos objetos para o mesmo.
    }
}
