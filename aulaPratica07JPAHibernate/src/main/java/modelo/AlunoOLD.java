package modelo;

import javax.persistence.*;

@Entity
@Table(name="aluno_old")
public class AlunoOLD {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int matricula;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    @Column(length = 15, nullable = false, unique = true)
    private String rg;
    @Column(length = 100)
    private String email;
    @Column(nullable = false)
    private int anoNascimento;

    public AlunoOLD() {
    }

    public AlunoOLD(int matricula, String cpf, String rg, String nome, String email, int anoNascimento) {

        this.matricula = matricula;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
