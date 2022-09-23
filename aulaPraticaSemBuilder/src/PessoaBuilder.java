import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {
    private Pessoa pessoa;
    private Endereco endereco;
    private List telefones = new ArrayList<>();

    public PessoaBuilder(){
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
        this.telefones = new ArrayList<>();

        pessoa.setEndereco(endereco);
        pessoa.setTelefones(telefones);
    }

    public void setNome(String nome, String sobrenome){
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
    }

    public void setDataNascimento(int dia, int mes, int ano){
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
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

    public Pessoa get(){
        return this.pessoa;
    }

}
