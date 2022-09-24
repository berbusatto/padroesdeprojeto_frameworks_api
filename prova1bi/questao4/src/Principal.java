

public class Principal {
    public static void main(String[] args) {

        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();

        ////////////////////////////////////////////////////////

        funcionarioBuilder.setNome("Bernardo", "Busatto");
        funcionarioBuilder.setDataNascimento(21,1,1991);
        funcionarioBuilder.setLogradouro("BR 116");
        funcionarioBuilder.setNumero("99999");
        funcionarioBuilder.setComplemento("BL z AP 000");
        funcionarioBuilder.setBairro("Bemlonginho");
        funcionarioBuilder.setCidade("Curitiba");
        funcionarioBuilder.setPais("Brasil");
        funcionarioBuilder.setFone(40, 999888777, "celular");
        funcionarioBuilder.setFone(40, 987879798, "recados");
        funcionarioBuilder.setFormacao("Sociologia", "PUCPR", 2011, 2015);
        funcionarioBuilder.setConjuge("Maria Claudia", "Gorges", "maria@gmail.com");

        Funcionario funcionario = funcionarioBuilder.get();

        System.out.println(funcionario.toString());

        /////////////////////////////////////////////////////////

        FuncionarioBuilder funcionarioBuilder2 = new FuncionarioBuilder();
        funcionarioBuilder2.setNome("Joao", "Silva");
        funcionarioBuilder2.setDataNascimento(1,2,1993);
        funcionarioBuilder2.setLogradouro("Rua ABCD");
        funcionarioBuilder2.setNumero("4333");
        funcionarioBuilder2.setComplemento("Casa 3");
        funcionarioBuilder2.setBairro("Lá");
        funcionarioBuilder2.setCidade("Curitiba");
        funcionarioBuilder2.setPais("Brasil");
        funcionarioBuilder2.setFormacao("História", "UFPR", 2010, 2014);

        Funcionario funcionario2 = funcionarioBuilder2.get();

        System.out.println(funcionario2.toString());

        FuncionarioBuilder funcionarioBuilder3 = new FuncionarioBuilder();
        funcionarioBuilder3.setNome("Jose", "Souza");
        funcionarioBuilder3.setDataNascimento(14,11,2004);
        funcionarioBuilder3.setLogradouro("Rua amaldicoada");
        funcionarioBuilder3.setNumero("666");
        funcionarioBuilder3.setComplemento("AP 25");
        funcionarioBuilder3.setBairro("AquiPerto");
        funcionarioBuilder3.setCidade("Curitiba");
        funcionarioBuilder3.setPais("Brasil");
        funcionarioBuilder3.setFormacao("Engenharia da Computação", "PUCPR", 1991, 1995);
        funcionarioBuilder.setConjuge("Josete", "Souza", "josetinha@gmail.com");

        Funcionario funcionario3 = funcionarioBuilder3.get();

        System.out.println(funcionario3.toString());

    }
}
