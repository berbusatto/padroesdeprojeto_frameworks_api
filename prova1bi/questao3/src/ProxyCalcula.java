public class ProxyCalcula {
    Calcula calc1 = new Calcula();
    ArquivoSingleton sing = ArquivoSingleton.getInstancia();
    public double soma(double n1, double n2){
        sing.gravaArquivo(String.valueOf(n1 + n2));
        return calc1.soma(n1, n2);
    }
    public double subtrai(double n1, double n2){
        sing.gravaArquivo(String.valueOf(n1 - n2));
        return  calc1.subtrai(n1, n2);
    }
    public double multiplica(double n1, double n2){
        sing.gravaArquivo(String.valueOf(n1* n2));
        return  calc1.multiplica(n1, n2);
    }
    public double divide(double n1, double n2){
        sing.gravaArquivo(String.valueOf(
                (n2 != 0) ? n1 / n2 : 0)
        );
        return  calc1.divide(n1, n2);
    }
}
