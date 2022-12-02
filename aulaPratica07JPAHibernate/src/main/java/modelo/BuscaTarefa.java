package JPA;

import modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        Tarefa encontrada = manager.find(Tarefa.class, 1L);
        System.out.println("-----------------------");
        System.out.println("DESCRIÇÃO DA TAREFA");
        System.out.println(encontrada.getDescricao());

        manager.close();
    }
}
