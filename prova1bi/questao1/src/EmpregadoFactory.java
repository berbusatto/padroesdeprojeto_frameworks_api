public class EmpregadoFactory {
    public static Empregado getEmpregado(String nome, String email, int anoContratacao, double salario, double comissao, int vendas, double valor_producao, int quantidade,double valor_hora, double quant_horas){

        if(salario != 0 && vendas == 0) {
            Gerente g1 = new Gerente(nome, email, anoContratacao);
            g1.setSalario(salario);
            return g1;

        } else if(comissao!= 0 && vendas!=0){
            PorComissao por_comissao = new PorComissao(nome, email, anoContratacao);
            por_comissao.setComissao(comissao);
            por_comissao.setVendas(vendas);
            return por_comissao;

        } else if(valor_producao != 0 && quantidade != 0){
            PorItem por_item = new PorItem(nome, email, anoContratacao);
            por_item.setValorProducao(valor_producao);
            por_item.setQuantidade(quantidade);
            return por_item;

        } else if (valor_hora != 0 && quant_horas != 0) {
            PorHora por_hora = new PorHora(nome, email, anoContratacao);
            por_hora.setQuantHoras(quant_horas);
            por_hora.setPorHora(valor_hora);
            return  por_hora;
        } else{
            return null;
        }
    }
}
