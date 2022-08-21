package principal;

public class Main {
    public static void main(String[] args) {
        Cliente cliente_01 = new Cliente();

        // O que acontece se mudanças nos atributos do objeto cliente_01 for realizada conforme abaixo ?
        cliente_01.cpf = "03510400902";
        cliente_01.anoNascimento = 1985;
        cliente_01.nome = "Ana Clara Marques";
        cliente_01.email = "aninha@gmail.com";

        // O compilador retorna um erro pois os atributos de Cliente estão com o modificador protected.
        // Como a classe Cliente está em outro pacote, não é possível acessar.


        //No main(), instanciar o objeto conta_01 conforme abaixo:
        //Conta conta_01 = new Conta()
        //O que acontece se mudanças nos atributos do objeto conta_01 for realizada conforme abaixo ?

        Conta conta_01 = new Conta();
        conta_01.numero = 1519;

        // Acontece a mesma coisa, os atributos de Conta estão como protected, então não é possível acessá-los desta forma.


        // Depois de mover os dois arquivos para a pasta principal, não foi encontrado nenhum erro
        // pois agora que estão no mesmo pacote podem ser acessadas pela classe principal.



    }
}
