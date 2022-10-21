public class CPU {
    private double clock;
    private int status; // 1- ligada, 2- processando, 3- repouso, 4- desligada

    public CPU(double clock, int status) {
        this.clock = clock;
        this.status = status;
    }

    public void inicia(){
        System.out.println("Inicialização inicial");
        this.status = 1;
    }

    public void execute(){
        System.out.println("Executa algo na CPU");
        this.status = 2;
    }
    public void carrega(){
        if(this.status != 2){
            this.status = 2;
        }
        System.out.println("Carrega registradores");
    }

    public void libera(){
        System.out.println("Libera registradores");
        this.status = 3;
    }

    public void desliga(){
        System.out.println("Desliga a CPU");
        this.status = 4;
    }

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
