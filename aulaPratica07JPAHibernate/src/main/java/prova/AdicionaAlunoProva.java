package prova;

import controllers.TransactionController;
import modelo2.ClienteEmpresa;
import modelo2.Funcionario;
import modelo3.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionaAlunoProva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String response;

        System.out.println("Deseja cadastrar aluno? S ou N ");
        response = teclado.nextLine();

        while(response.equalsIgnoreCase("s")){
            Aluno aluno = new Aluno();
            ArrayList<Disciplina> disciplinas = new ArrayList<>();

            System.out.println("----INSERINDO ALUNO----");

            System.out.println("Nome: ");
            aluno.setNome(teclado.nextLine());

            System.out.println("Email: ");
            aluno.setEmail(teclado.nextLine());

            System.out.println("CPF");
            aluno.setCpf(teclado.nextLine());

            System.out.println("Sexo");
            aluno.setSexo(teclado.nextLine());

            System.out.println("Deseja inserir suas disciplinas? S ou N ");
            String response2 = teclado.nextLine();

            while(response2.equalsIgnoreCase("s")){
                Disciplina disciplina = new Disciplina();
                System.out.println("----INSERINDO DISCIPLINA----");

                System.out.println("Nome: ");
                disciplina.setNome(teclado.nextLine());

                System.out.println("Carga horária: ");
                disciplina.setCargaHoraria(teclado.nextInt());

                teclado.nextLine();

                disciplinas.add(disciplina);


                System.out.println("Deseja inserir mais uma disciplina? S ou N ");
                response2 = teclado.nextLine();
            }
            aluno.setDisciplinas(disciplinas);
            System.out.println("--------------------");
            TransactionController.transactionAdd(aluno);

            System.out.println("Deseja cadastrar mais um aluno? S ou N ");
            response = teclado.nextLine();
        }

        System.out.println("RELATÓRIOS QUERYS JPQL");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        // QUANTIDADE DE ALUNOS CADASTRADA
        Query consulta1 = manager.createQuery("select count(a) from Aluno a");
        List alunos = consulta1.getResultList();
        System.out.println("A quantidade de alunos é: " + alunos);


        // LISTAGEM DE ALUNOS E DISCIPLINAS
        Query consulta2 = manager.createQuery("select a from Aluno a ");
        List alunosDiciplinas = consulta2.getResultList();

        for(Object aluno: alunosDiciplinas){
            System.out.println("ALUNOS/DISCIPLINAS");
            System.out.println(aluno.toString());
        }


        // LISTAGEM DAS MULHERES

        Query consulta3 = manager.createQuery("select a from Aluno a where a.sexo = :sexo");
        consulta3.setParameter("sexo", "f");
        List alunasMulheres = consulta3.getResultList();

        for(Object alunas: alunasMulheres){
            System.out.println("ALUNAS MULHERES");
            System.out.println(alunas.toString());
        }

        //LISTAGEM DOS HOMENS

        Query consulta4 = manager.createQuery("select a from Aluno a where a.sexo = :sexo");
        consulta4.setParameter("sexo", "m");
        List alunosHomens = consulta4.getResultList();

        for(Object alunoHomem: alunosHomens){
            System.out.println("ALUNOS HOMENS");
            System.out.println(alunoHomem.toString());
        }

        // LISTA DE TODOS QUE COMEÇAM COM A
        Query consulta5 = manager.createQuery("select a from Aluno a where a.nome like :nome");
        consulta5.setParameter("nome", "a%");
        List alunosA = consulta5.getResultList();

        for(Object alunoA: alunosA){
            System.out.println("ALUNOS COM A");
            System.out.println(alunoA.toString());
        }



        manager.close();




    }
}
