public class Memoria {
    private int tamanho;
    private int ocupado;

    public Memoria(int tamanho, int ocupado) {
        this.tamanho = tamanho;
        this.ocupado = ocupado;
    }

    public void carregar(int position, String info){
        System.out.println("Carrega dados na memória");
        this.ocupado += info.length();
    }

    public void liberar(int position, String info){
        System.out.println("Libera dados na memória");
        this.ocupado -= info.length();
    }

    public String ler(int position, int tamanho){
        System.out.println("Dados lidos na memória");
        return "Dados lidos na memória";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getOcupado() {
        return ocupado;
    }
}
