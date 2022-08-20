package ex08;

public class Principal {
    public static void main(String[] args) {
        Livro liv = new Livro(1, 39.99f, "Guilera", "Meia Vida", 666);
        Midia mid = new Midia(2, 69.99f, "Gojira");

        System.out.println(liv.toString());
        System.out.println("Frete: " + String.format("%.2f", liv.calculaFrete()));

        System.out.println(mid.toString());
        System.out.println("Frete: " + String.format("%.2f", mid.calculaFrete()));

    }
}
