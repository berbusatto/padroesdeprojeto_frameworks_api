package JPA;

import modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExcluiTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        Tarefa encontrada = manager.find(Tarefa.class, 1L);

        manager.remove(encontrada);
        manager.getTransaction().commit();
        manager.close();

    }
}
