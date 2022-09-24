import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {
    private Funcionario funcionario;
    private Endereco endereco;
    private List telefones;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List getTelefones() {
        return telefones;
    }

    public void setTelefones(List telefones) {
        this.telefones = telefones;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Conjuge getConjuge() {
        return conjuge;
    }

    public void setConjuge(Conjuge conjuge) {
        this.conjuge = conjuge;
    }

    private Formacao formacao;
    private Conjuge conjuge;

    public FuncionarioBuilder(){
        this.funcionario = new Funcionario();
        this.endereco = new Endereco();
        this.telefones = new ArrayList<>();
        this.formacao = new Formacao();
        this.conjuge = new Conjuge();

        funcionario.setEndereco(endereco);
        funcionario.setTelefones(telefones);
        funcionario.setFormacao(formacao);
    }

    public void setNome(String nome, String sobrenome){
        this.funcionario.setNome(nome);
        this.funcionario.setSobrenome(sobrenome);
    }

    public void setDataNascimento(int dia, int mes, int ano){
        this.funcionario.setDia(dia);
        this.funcionario.setMes(mes);
        this.funcionario.setAno(ano);
    }

    public void setLogradouro(String logradouro){
        this.endereco.setLogradouro(logradouro);
    }

    public void setNumero(String numero){
        this.endereco.setNumero(numero);
    }

    public void setComplemento(String complemento){
        this.endereco.setComplemento(complemento);
    }

    public void setBairro(String bairro){
        this.endereco.setBairro(bairro);
    }

    public void setCidade(String cidade){
        this.endereco.setCidade(cidade);
    }

    public void setPais(String pais){
        this.endereco.setPais(pais);
    }

    public void setFone(int ddd, int numero, String tipoFone){
        this.telefones.add(new Telefone(ddd, numero, tipoFone));
    }
    public void setFormacao(String curso, String instituicao, int anoInic, int anoFim){
        this.formacao.setCurso(curso);
        this.formacao.setInstituicao(instituicao);
        this.formacao.setAnoFinal(anoFim);
        this.formacao.setAnoInicial(anoInic);
    }
    public void setConjuge(String nome, String sobrenome, String email){
        this.conjuge.setNome(nome);
        this.conjuge.setSobrenome(sobrenome);
        this.conjuge.setEmail(email);
    }

    public Funcionario get(){
        return this.funcionario;
    }
}



