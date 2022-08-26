package singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton sing_01 = new Singleton();
        // O construtor � um m�todo private, portanto n�o � acess�vel fora do getInstancia()

        Singleton sing_02 = Singleton.getInstancia();

        Singleton sing_03 = Singleton.getInstancia();

        if (sing_02 == sing_03){
            System.out.println("Objetos s�o iguais");
        } else {
            System.out.println("Objetos s�o diferentes");
        }

        // Os objetos s�o iguais, pois o construtor aponta novos objetos para o mesmo.
    }
}
