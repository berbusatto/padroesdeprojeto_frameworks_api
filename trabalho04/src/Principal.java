public class Principal {

    public static void main(String[] args) {
        ArquivoSingleton arq1 = ArquivoSingleton.getInstance();

        arq1.gravaArquivo(" Linha 1 - Gerado pela executor 1");
        arq1.gravaArquivo(" Linha 2 - Gerado pela executor 1");
        System.out.printf("Arquivo atualizado\n");

        ArquivoSingleton arq2 = ArquivoSingleton.getInstance();

        arq2.gravaArquivo("Linha 3 - Gerado pelo executor 2");
        arq2.gravaArquivo("Linha 4- Gerado pelo executor 2");
        System.out.printf("Arquivo atualizado");
    }
}
