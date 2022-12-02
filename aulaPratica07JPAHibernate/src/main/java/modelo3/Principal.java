package modelo3;

import controllers.TransactionController;

public class Principal {
    public static void main(String[] args) {


        Produto arrozBranco = new Produto();
        arrozBranco.setDescricao("Arroz Branco");
        arrozBranco.setPreco(15.90);
        TransactionController.transactionAdd(arrozBranco);


        Produto arrozIntegral = new Produto();
        arrozIntegral.setDescricao("Arroz Integral");
        arrozIntegral.setPreco(17.49);
        TransactionController.transactionAdd(arrozIntegral);

        Produto feijao = new Produto();
        feijao.setDescricao("Feijão");
        feijao.setPreco(7.90);
        TransactionController.transactionAdd(feijao);

        Produto leite = new Produto();
        leite.setDescricao("Leite");
        leite.setPreco(5.70);
        TransactionController.transactionAdd(leite);

        Produto tomate = new Produto();
        tomate.setDescricao("Tomate");
        tomate.setPreco(9.80);
        TransactionController.transactionAdd(tomate);

        Produto carneBovina = new Produto();
        carneBovina.setDescricao("Carne Bovina");
        carneBovina.setPreco(35.40);
        TransactionController.transactionAdd(carneBovina);

        Produto frango = new Produto();
        frango.setDescricao("Frango");
        frango.setPreco(18.90);
        TransactionController.transactionAdd(frango);

        Produto carneSuina = new Produto();
        carneSuina.setDescricao("Carne Suina");
        carneSuina.setPreco(23.75);
        TransactionController.transactionAdd(carneSuina);

        Produto batata = new Produto();
        batata.setDescricao("Batata");
        batata.setPreco(8.50);
        TransactionController.transactionAdd(batata);




    }
}
