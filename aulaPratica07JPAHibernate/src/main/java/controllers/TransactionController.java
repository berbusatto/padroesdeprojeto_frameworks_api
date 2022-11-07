package controllers;

import modelo2.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class TransactionController {
    public static void transactionAdd(Object obj){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(obj);
        manager.getTransaction().commit();
        System.out.println("Adicionado");
        manager.close();
    }

    public static Funcionario transactionGet(String cpf){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        Funcionario encontrado = manager.find(Funcionario.class, cpf);
        System.out.println("Buscando ->>>" + encontrado.toString());
        manager.close();
        return encontrado;
    }
}
