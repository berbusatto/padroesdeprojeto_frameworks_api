public class HD {

    private int capacidade;

    public HD(int capacidade) {
        this.capacidade = capacidade;
    }

    public String ler(int posicaoInicial, int size){
        System.out.println("Lê dados no HD");
        return"Informação lida do HD";
    }

    public void escrever(int posicao,String info){
        System.out.println("Escreve dados no HD");
    }

    public int getCapacidade() {
        return capacidade;
    }
}
