package JPA;

import controllers.TransactionController;
import modelo2.ClienteEmpresa;
import modelo2.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

public class AdicionaFuncionario {
    public static void main(String[] args) {




        Scanner teclado = new Scanner(System.in);
        String response;


        System.out.println("Deseja cadastrar funcionário? S ou N ");
        response = teclado.nextLine();

        while(response.equalsIgnoreCase("s")){
            Funcionario funcionario = new Funcionario();
            ArrayList<ClienteEmpresa> clientes = new ArrayList<>();

            System.out.println("----INSERINDO FUNCIONÁRIO----");

            System.out.println("Nome: ");
            funcionario.setNome(teclado.nextLine());

            System.out.println("Email: ");
            funcionario.setEmail(teclado.nextLine());

            System.out.println("CPF");
            funcionario.setCpf(teclado.nextLine());

            System.out.println("Deseja inserir seus clientes? S ou N ");
            String response2 = teclado.nextLine();

            while(response2.equalsIgnoreCase("s")){
                ClienteEmpresa clienteEmpresa = new ClienteEmpresa();
                System.out.println("----INSERINDO CLIENTE----");

                System.out.println("Nome: ");
                clienteEmpresa.setNome(teclado.nextLine());

                System.out.println("Email: ");
                clienteEmpresa.setEmail(teclado.nextLine());

                System.out.println("CPF: ");
                clienteEmpresa.setCpf(teclado.nextLine());

                System.out.println("Ano Nascimento: ");
                clienteEmpresa.setAnoNascimento(teclado.nextInt());
                teclado.nextLine();

                clientes.add(clienteEmpresa);

                System.out.println("Deseja inserir mais clientes? S ou N ");
                response2 = teclado.nextLine();
            }

            System.out.println("--------------------");
            TransactionController.transactionAdd(funcionario);

            System.out.println("Deseja cadastrar mais um funcionário? S ou N ");
            response = teclado.nextLine();

        }

    }
}
