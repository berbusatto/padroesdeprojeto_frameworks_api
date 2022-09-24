public class ProxyCalcula {
    Calcula calc1 = new Calcula();
    public double soma(double n1, double n2){
        System.out.println("Somando " + n1 + " com " + n2);
        return calc1.soma(n1, n2);
    }
    public double subtrai(double n1, double n2){
        System.out.println("Subtraindo " + n1 + " com " + n2);
        return  calc1.subtrai(n1, n2);
    }
    public double multiplica(double n1, double n2){
        System.out.println("Multiplicando " + n1 + " com " + n2);
        return  calc1.multiplica(n1, n2);
    }
    public double divide(double n1, double n2){
        System.out.println("Dividindo " + n1 + " com " + n2);
        return  calc1.divide(n1, n2);
    }
}
