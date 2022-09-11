import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Endereco end1 = new Endereco();
        end1.setLogradouro("BR 116");
        end1.setNumero("17844");
        end1.setComplemento("Bloco 7 AP 304");
        end1.setBairro("Pinheirinho");
        end1.setCidade("Curitiba");
        end1.setPais("Brasil");

        Telefone tel1 = new Telefone(41, 987382981, "celular");
        Telefone tel2 = new Telefone(41, 997854261, "celular");

        ArrayList<Telefone> telArray = new ArrayList<>();
        telArray.add(tel1);
        telArray.add(tel2);

        Pessoa p1 = new Pessoa("Bernardo", "Busatto", 21,01, 1991, end1, telArray);
        System.out.println(p1);

    }
}
