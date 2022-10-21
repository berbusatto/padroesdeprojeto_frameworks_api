public class ComputadorFacade {
    private CPU cpu = null;
    private Memoria memoria = null;
    private HD hd = null;

    public ComputadorFacade() {
        this.cpu = new CPU(5.7, 4);
        this.memoria = new Memoria(6000000, 0);
        this.hd = new HD(4000000);
    }

    public void ligarComputador(){
        int BOOT_SECTOR = 20;
        int SECTOR_SIZE = 2048;
        int BOOT_ADDRESS = 2526;

        cpu.inicia();
        String hdBootInfo = hd.ler(BOOT_SECTOR, SECTOR_SIZE);
        memoria.carregar(BOOT_ADDRESS, hdBootInfo);
        cpu.execute();
    }

}
