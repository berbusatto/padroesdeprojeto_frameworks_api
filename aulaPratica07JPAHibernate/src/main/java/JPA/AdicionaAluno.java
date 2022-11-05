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
        aluno1.setRg("63675658");
        aluno1.setCpf("097320933");
        aluno1.setEmail("maria@gmail.com");
        aluno1.setAnoNascimento(2000);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        try {
            manager.getTransaction().begin();
            manager.persist(aluno1);
            manager.getTransaction().commit();
            System.out.println("Aluno adicionado\n" + aluno1.toString());
        } catch (PersistenceException e) {
            System.out.println("Erro na inclusão do aluno -> " + aluno1.toString());
            System.out.println(e.getMessage());

        }

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Marcos Santana");
        aluno2.setCpf("02850338962");
        aluno2.setRg("26323134");
        aluno2.setEmail("marcos@gmail.com");
        aluno2.setAnoNascimento(1998);

        try {
            manager.getTransaction().begin();
            manager.persist(aluno2);
            manager.getTransaction().commit();
            System.out.println("Aluno adicionado\n" + aluno2.toString());
        } catch (PersistenceException e) {
            System.out.println("Erro na inclusão do aluno -> " + aluno2.toString());
            System.out.println(e.getMessage());
        }


        Aluno aluno3 = new Aluno();
        aluno3.setNome("José Santos");
        aluno3.setRg("4578987");
        aluno3.setCpf("73178619");
        aluno3.setEmail("sjose@gmail.com");
        aluno3.setAnoNascimento(1999);

        try {
            manager.getTransaction().begin();
            manager.persist(aluno3);
            manager.getTransaction().commit();
            System.out.println("Aluno adicionado\n" + aluno3.toString());
        } catch (PersistenceException e) {
            System.out.println("Erro na inclusão do aluno -> " + aluno3.toString());
            System.out.println(e.getMessage());
        }
        manager.close();


    }
}
