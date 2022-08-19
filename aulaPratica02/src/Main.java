public class Main {
    public static void main(String[] args) {

        Poupanca poup_01 = new Poupanca(1789, 756.90f, 15);

        Poupanca poup_02 = new Poupanca();
        poup_02.setNumero(12174);
        poup_02.setSaldo(241.95f);
        poup_02.setAniversario(02);

        Especial espec_01 = new Especial(3341, 10522f, 30000f);
        Especial espec_02 = new Especial();
        espec_02.setNumero(2049);
        espec_02.setSaldo(5840.05f);
        espec_02.setLimite(7000.00f);

        System.out.println(poup_01.toString());
        System.out.println(poup_02.toString());
        System.out.println(espec_01.toString());
        System.out.println(espec_02.toString());

        if (poup_01.debitaSaldo(110.00f)){
            System.out.println("Valor debitado.");
        } else{
            System.out.println("Valor não debitado por falta de saldo.");
        }

        if (espec_01.debitaSaldo(50000f)){
            System.out.println("Valor debitado.");
        } else{
            System.out.println("Valor não debitado por falta de saldo.");
        };



    }
}
