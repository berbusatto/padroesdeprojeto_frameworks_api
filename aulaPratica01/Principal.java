package aulaPratica01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setCpf("02850435902");
        cliente1.setAnoNascimento(1980);
        cliente1.setEmail("mr_souza@gmail.com");
        cliente1.setNome("Marcos da Rocha Souza");

        Conta conta1 = new Conta();
        conta1.setNumero(1521);
        conta1.setSaldo(750.63f);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana Clara Marques");
        cliente2.setEmail("aninha@gmail.com");
        cliente2.setCpf("03510400902");
        cliente2.setAnoNascimento(1985);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pedro de Alcantara");
        cliente3.setEmail("pedro_75@gmail.com");
        cliente3.setCpf("04564238906");
        cliente3.setAnoNascimento(1975);

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Pedro Andre Marcondes");
        cliente4.setEmail("pedro@gmail.com");
        cliente4.setCpf("03289078908");
        cliente4.setAnoNascimento(1977);

        conta1.debitaSaldo(100f);
        System.out.println(conta1.getSaldo());

        conta1.creditaSaldo(1000f);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.toString());

        Scanner teclado = new Scanner(System.in);
        Cliente cliente5 = new Cliente();

        System.out.println("Digite os dados do cliente.");
        System.out.println("Nome: ");
        cliente5.setNome(teclado.nextLine());

        System.out.println("CPF: ");
        cliente5.setCpf(teclado.nextLine());

        System.out.println("E-mail: ");
        cliente5.setEmail(teclado.nextLine());

        System.out.println("Ano de nascimento: ");
        cliente5.setAnoNascimento(teclado.nextInt());

        System.out.println(cliente5.toString());


        Conta conta2 = new Conta();
        System.out.println("Número da conta: ");
        conta2.setNumero(teclado.nextInt());
        System.out.println("Saldo da conta: ");
        conta2.setSaldo(teclado.nextFloat());

        System.out.println("Digite um valor a ser debitado da conta: ");
        conta2.debitaSaldo(teclado.nextFloat());
        conta2.toString();
        System.out.println("Digite um valor a ser creditado na conta: ");
        conta2.creditaSaldo(teclado.nextFloat());

        System.out.println(conta2.toString());


    }
}
