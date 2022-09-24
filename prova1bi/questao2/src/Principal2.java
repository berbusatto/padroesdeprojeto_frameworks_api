public class Principal2 {
    public static void main(String[] args) {

        ProxyCalcula calculadora = new ProxyCalcula();

        System.out.println(calculadora.soma(5, 10));
        System.out.println(calculadora.subtrai(18, 9));
        System.out.println(calculadora.multiplica(3, 2));
        System.out.println(calculadora.divide(30, 5));

    }
}
