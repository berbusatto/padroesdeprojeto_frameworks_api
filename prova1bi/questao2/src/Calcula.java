

public class Calcula implements  CalculaInterface{

    public double soma(double n1, double n2){
        return n1 + n2;
    }
    public double subtrai(double n1, double n2){
        return  n1 - n2;
    }
    public double multiplica(double n1, double n2){
        return n1 * n2;
    }
    public double divide(double n1, double n2){
        if (n2 != 0){
            return n1 / n2;
        } else{
            System.out.println("Impossível dividir por 0");
            return 0;
        }
    }
}
