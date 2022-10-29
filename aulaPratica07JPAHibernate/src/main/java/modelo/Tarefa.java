package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="registro_tarefas")
public class Tarefa {
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private boolean finalizado;

    private LocalDate dataConclusao;

    @Transient
    private String responsavel;

    public Tarefa() {
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", finalizado=" + finalizado +
                ", dataConclusao=" + dataConclusao +
                '}';
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Tarefa(Long id, String descricao, boolean finalizado) {
        this.id = id;
        this.descricao = descricao;
        this.finalizado = finalizado;
    }
}
