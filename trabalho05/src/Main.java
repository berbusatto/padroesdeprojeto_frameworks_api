public class Main {
    public static void main(String[] args) {
        EmpregadoFactory factory = new EmpregadoFactory();

        int cargo, anoContratacao;
        String nome, email;

        cargo = 1;
        anoContratacao = 2021;
        nome = "Bernardo";
        email = "ber@busatto.com.br";

        Empregado emp1 = factory.getEmpregado(cargo, nome, email, anoContratacao);

        int cargoB = 2;
        int anoContratacaoB = 1999;
        String nomeB = "Dilermando", emailB = "dilermandoreis@ibest.com.br";
        System.out.println(emp1.toString());

        Empregado emp2 = factory.getEmpregado(cargoB, nomeB, emailB, anoContratacaoB);
        System.out.println(emp2.toString());

        // Não consigo usar o método de Gerente setSalario(), pois o objeto foi criado como

    }
}
