public class EmpregadoFactory {
    public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao){
        switch (cargo){
            case 1:
                return new Gerente(nome, email, anoContratacao);
            case 2:
                return new PorComissao(nome, email, anoContratacao);
            case 3:
                return new PorHora(nome, email, anoContratacao);
            case 4:
                return new PorItem(nome, email, anoContratacao);
            default:
                System.out.println("ERRO, ESCOLHA UM DOS CÓDIGOS ABAIXO:\n1 - Gerente\n2- Por Comissão\n3- Por Hora\n4- Por Item\n");
                return null;
        }
    }
}
