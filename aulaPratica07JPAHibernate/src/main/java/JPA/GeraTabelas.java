package JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        factory.close();
        System.out.println("Tabelas gerados, dados antigos perdidos.");
    }
}


