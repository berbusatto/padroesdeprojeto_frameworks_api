package prova;

import javax.persistence.*;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(nullable = false)
    private int cargaHoraria;
    @Column(nullable = false, length = 60)
    private String nome;

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", cargaHoraria=" + cargaHoraria +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
