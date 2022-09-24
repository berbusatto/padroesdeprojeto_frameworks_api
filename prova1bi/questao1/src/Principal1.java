    public class Principal1 {

        public static void main(String[] args) {

            String nome;
            String email;
            int anoContratacao;
            float salario;
            float comissao;
            int vendas;
            float valor_producao;
            int quantidade;
            float valor_hora;
            int quant_horas;

            //
            // Teste GERENTE
            //
            nome           = "Antonio Maciel";
            email          = "antonio@gmail.com";
            anoContratacao = 2005;
            salario        = 1500.00f;

            comissao       = 0;
            vendas         = 0;
            valor_producao = 0;
            quantidade     = 0;
            valor_hora     = 0;
            quant_horas    = 0;

            Empregado emp1 = EmpregadoFactory.getEmpregado(nome,       email,  anoContratacao, salario,
                    comissao,   vendas, valor_producao, quantidade,
                    valor_hora, quant_horas );
            System.out.println(emp1.getClass());
            System.out.println(emp1.toString());
            System.out.println(emp1.calculaSalario());
            System.out.println(emp1.tempoCasa());


            //
            // Teste POR COMISSAO
            //
            nome           = "Maria Andrade";
            email          = "maria@gmail.com";
            anoContratacao = 2012;
            salario        = 1500.00f;
            comissao       = 20.5f;
            vendas         = 400;

            valor_producao = 0;
            quantidade     = 0;
            valor_hora     = 0;
            quant_horas    = 0;

            Empregado emp2 = EmpregadoFactory.getEmpregado(nome,       email,  anoContratacao, salario,
                    comissao,   vendas, valor_producao, quantidade,
                    valor_hora, quant_horas );
            System.out.println("");
            System.out.println(emp2.getClass());
            System.out.println(emp2.toString());
            System.out.println(emp2.calculaSalario());
            System.out.println(emp2.tempoCasa());

            //
            // Teste POR ITEM
            //
            nome           = "Marcelo Passos Silva";
            email          = "msilva@gmail.com";
            anoContratacao = 2009;
            valor_producao = 250.65f;
            quantidade     = 40;

            salario        = 0;
            comissao       = 0;
            vendas         = 0;
            valor_hora     = 0;
            quant_horas    = 0;

            Empregado emp3 = EmpregadoFactory.getEmpregado(nome,email, anoContratacao, salario,
                    comissao,   vendas, valor_producao, quantidade,
                    valor_hora, quant_horas );
            System.out.println("");
            System.out.println(emp3.getClass());
            System.out.println(emp3.toString());
            System.out.println(emp3.calculaSalario());
            System.out.println(emp3.tempoCasa());

            //
            // Teste POR HORA
            //
            nome           = "Juarez Marques";
            email          = "marques@gmail.com";
            anoContratacao = 2001;
            valor_hora     = 38.70f;
            quant_horas    = 180;

            valor_producao = 0;
            quantidade     = 0;
            salario        = 0;
            comissao       = 0;
            vendas         = 0;


            Empregado emp4 = EmpregadoFactory.getEmpregado(nome,       email,  anoContratacao, salario,
                    comissao,   vendas, valor_producao, quantidade,
                    valor_hora, quant_horas );
            System.out.println("");
            System.out.println(emp4.getClass());
            System.out.println(emp4.toString());
            System.out.println(emp4.calculaSalario());
            System.out.println(emp4.tempoCasa());

        }

    }

//
//Gerente antonio = new Gerente ("Antonio Silva", "silva@gmail.com", 13450.00f, 2010);
//System.out.println(antonio.toString());
//System.out.println(antonio.ganha());
//System.out.println(antonio.tempoCasa());
//
//PorComissao jose = new PorComissao ("Jose Macedo", "macedo@gmail.com", 2500.00f, 159f, 20, 2002);
//System.out.println(jose.toString());
//System.out.println(jose.ganha());
//System.out.println(jose.tempoCasa());
//
//PorItem marcos = new PorItem ("Marcos Prestes", "prestes@gmail.com", 250.00f, 300, 1999);
//System.out.println(marcos.toString());
//System.out.println(marcos.ganha());
//System.out.println(marcos.tempoCasa());
//
//PorHora joel = new PorHora ("Joel Guimaraes", "joel@gmail.com", 120.00f, 220, 2019);
//System.out.println(joel.toString());
//System.out.println(joel.ganha());
//System.out.println(joel.tempoCasa());
//



