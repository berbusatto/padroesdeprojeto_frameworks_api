package JPA;

import modelo2.Cliente;
import modelo2.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AdicionaCliente {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        cliente1.setNome(teclado.nextLine());

        System.out.println("Digite o CPF do cliente: ");
        cliente1.setCpf(teclado.nextLine());

        System.out.println("Digite o email do cliente: ");
        cliente1.setEmail(teclado.nextLine());

        System.out.println("Digite o ano de nascimento do cliente: ");
        cliente1.setAnoNascimento(teclado.nextInt());

        Conta conta1 = new Conta(2000.99f);

        cliente1.setConta(conta1);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(cliente1);
        manager.getTransaction().commit();

        System.out.println("ID tarefa: "+ cliente1.getCpf());
        System.out.println("Cliente adicionado");
        manager.close();


    }
}
