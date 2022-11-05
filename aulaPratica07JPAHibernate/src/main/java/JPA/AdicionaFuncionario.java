package JPA;

import controllers.TransactionController;
import modelo.Tarefa;
import modelo2.ClienteEmpresa;
import modelo2.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class AdicionaFuncionario {
    public static void main(String[] args) {
        ClienteEmpresa clienteEmpresa1, clienteEmpresa2, clienteEmpresa3;
        Funcionario funcionario;
        ArrayList<ClienteEmpresa> clientes = new ArrayList<>();

        clienteEmpresa1 = new ClienteEmpresa("23423431", 1992, "Maria", "maria@fjpod");
        clienteEmpresa2 = new ClienteEmpresa("8494896", 1980, "Joao", "jojo@aosj");
        clienteEmpresa3 = new ClienteEmpresa("2135653", 1986, "Jose", "zeze@aosj");

        clientes.add(clienteEmpresa1);
        clientes.add(clienteEmpresa2);
        clientes.add(clienteEmpresa3);

        funcionario = new Funcionario();
        funcionario.setNome("Ana");
        funcionario.setCpf("32309873");
        funcionario.setEmail("aninha@oiedshao");
        funcionario.setClientes(clientes);

       System.out.println("--------------------");
       TransactionController.transactionAdd(funcionario);

        System.out.println("--------------------");
        TransactionController.transactionGet(funcionario.getCpf());
    }
}
