import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        PessoaBuilder pessoaBuilder = new PessoaBuilder();

        pessoaBuilder.setNome("Bernardo", "Busatto");
        pessoaBuilder.setDataNascimento(21,1,1991);
        pessoaBuilder.setLogradouro("BR 116");
        pessoaBuilder.setNumero("99999");
        pessoaBuilder.setComplemento("BL z AP 000");
        pessoaBuilder.setBairro("Bemlonginho");
        pessoaBuilder.setCidade("Curitiba");
        pessoaBuilder.setPais("Brasil");
        pessoaBuilder.setFone(40, 999888777, "celular");
        pessoaBuilder.setFone(40, 987879798, "recados");

        Pessoa pessoa = pessoaBuilder.get();

        System.out.println(pessoa.toString());


        PessoaBuilder pessoaBuilder2 = new PessoaBuilder();

        pessoaBuilder2.setNome("Pedro", "Busatto");
        pessoaBuilder2.setDataNascimento(18,02,1996);
        pessoaBuilder2.setLogradouro("Rua Americo Vespucio");
        pessoaBuilder2.setNumero("1111");
        pessoaBuilder2.setBairro("Maisperto");
        pessoaBuilder2.setCidade("Curitiba");
        pessoaBuilder2.setPais("Brasil");
        pessoaBuilder2.setFone(40, 911822733, "celular");

        Pessoa pessoa2 = pessoaBuilder2.get();

        System.out.println(pessoa2.toString());

    }
}
