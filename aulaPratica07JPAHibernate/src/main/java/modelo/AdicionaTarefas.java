package JPA;
import modelo.Tarefa;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;


public class AdicionaTarefas {
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar JPA e Hibernate");
        tarefa.setFinalizado(true);
        tarefa.setDataConclusao(LocalDate.parse("2022-05-22"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(tarefa);
        manager.getTransaction().commit();

        System.out.println("ID tarefa: "+ tarefa.getId());
        System.out.println("Tarefa adicionada");
        manager.close();


    }
}
