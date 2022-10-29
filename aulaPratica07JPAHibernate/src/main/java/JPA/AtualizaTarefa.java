package JPA;

import modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizaTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        Tarefa encontrada = manager.find(Tarefa.class, 1L);

        encontrada.setDescricao("Tarefa atualizada");
        manager.merge(encontrada);

        manager.getTransaction().commit();

        manager.close();

    }
}
