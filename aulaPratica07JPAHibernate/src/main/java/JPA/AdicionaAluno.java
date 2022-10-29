package JPA;

import modelo.Aluno;
import modelo.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.time.LocalDate;

public class AdicionaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria Clara Almeida");
        aluno1.setCpf("02850338962");
        aluno1.setRg("63675658");
        aluno1.setEmail("maria@gmail.com");
        aluno1.setAnoNascimento(2000);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        try {
            manager.getTransaction().begin();
            manager.persist(aluno1);
            manager.getTransaction().commit();
            System.out.println("Aluno adicionado" + aluno1.toString());
        } catch (PersistenceException e) {
            System.out.println("Erro na inclusão do aluno -> " + aluno1.toString());
            System.out.println(e.getMessage());

        }
        manager.close();



        Aluno aluno2 = new Aluno();
        aluno2.setNome("Marcos Santana");
        aluno2.setCpf("02850338962");
        aluno2.setEmail("marcos@gmail.com");
        aluno2.setAnoNascimento(1998);

        try {
            manager.getTransaction().begin();
            manager.persist(aluno2);
            manager.getTransaction().commit();
            System.out.println("Aluno adicionado" + aluno2.toString());
        } catch (PersistenceException e) {
            System.out.println("Erro na inclusão do aluno -> " + aluno2.toString());
            System.out.println(e.getMessage());
        }
        manager.close();
    }
}
