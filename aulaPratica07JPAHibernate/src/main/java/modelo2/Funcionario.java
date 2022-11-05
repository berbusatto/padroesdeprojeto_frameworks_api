package modelo2;

import javax.persistence.*;
import java.util.List;

@Entity
public class Funcionario {
    @Id
    @Column(length = 11)
    private String cpf;

    @Column(nullable = false,length = 60)
    private String nome;

    @Column(nullable = false,length = 40, unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="cpf_funcionario")
    private List<ClienteEmpresa> clientes;

    public Funcionario(String cpf, String nome, String email, List<ClienteEmpresa> clientes) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.clientes = clientes;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public List<ClienteEmpresa> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteEmpresa> clientes) {
        this.clientes = clientes;
    }
}
