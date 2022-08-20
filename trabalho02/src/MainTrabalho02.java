public class MainTrabalho02 {
    public static void main(String[] args) {

        Gerente antonio = new Gerente("Antonio Silva", "silva_a@gmail.com", 1991, 1299.99f);
        System.out.println(antonio);
        System.out.println(String.format("%.2f", antonio.calculaSalario()));
        System.out.println(antonio.tempoCasa());

        PorComissao jose = new PorComissao("Jose Santos", "ze@yahoo.com", 1999, 2599.99f, 783.12f, 13);
        System.out.println(jose.toString());
        System.out.println(String.format("%.2f", jose.calculaSalario()));
        System.out.println(jose.tempoCasa());

        PorHora marcos = new PorHora("Marcos Marques", "marxxx@uol.com", 2007, 29.70f, 100);
        System.out.println(marcos.toString());
        System.out.println(String.format("%.2f", marcos.calculaSalario()));
        System.out.println(marcos.tempoCasa());

        PorItem joel = new PorItem("Joel Jorel", "jojo@onda.com.br", 2014, 56.90f, 24);
        System.out.println(joel.toString());
        System.out.println(String.format("%.2f", joel.calculaSalario()));
        System.out.println(joel.tempoCasa());
    }
}
