package modelo3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {

        // DEVERIA ESTAR NA TRASNSACTIUON CONTROLLER

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        Query consulta1 = manager.createQuery(("select p from Produto p"));
        List<Produto> produtos = consulta1.getResultList();

        for(Produto prod: produtos){
            System.out.println(prod.toString());
        }
        manager.close();


    }
}
