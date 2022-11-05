package modelo2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClienteEmpresa {

    @Id
    @Column(length = 11)
    private String cpf;
    @Column(nullable = false)
    private int anoNascimento;
    @Column(nullable = false,length = 60)
    private String nome;
    @Column(nullable = false,length = 40, unique = true)
    private String email;

    public ClienteEmpresa(String cpf, int anoNascimento, String nome, String email) {
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.email = email;
    }

    public ClienteEmpresa() {
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
                "cpf='" + cpf + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
