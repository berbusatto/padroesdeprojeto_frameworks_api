package filaBancoSingleton;

public class Main {
    public static void main(String[] args) {
        Usuario usr01 = new Usuario(1, "Bernardo");
        Usuario usr02 = new Usuario(2, "Raphael");
        Usuario usr03 = new Usuario(3, "Aryon");
        Usuario usr04 = new Usuario(4, "Pedro");
        Usuario usr05 = new Usuario(5, "Heryck");
        Usuario usr06 = new Usuario(6, "Aaron");

        // OS 3 APONTAM PARA O MESMO OBJETO (instancia)
        FilaSingleton atendenteRecepcionista = FilaSingleton.getInstancia();
        FilaSingleton atendente01 = FilaSingleton.getInstancia();
        FilaSingleton atendente02 = FilaSingleton.getInstancia();

        atendenteRecepcionista.adicionaUsuario(usr01);
        atendenteRecepcionista.mostraFila();
        System.out.println("---");

        atendenteRecepcionista.adicionaUsuario(usr02);
        atendenteRecepcionista.mostraFila();
        System.out.println("---");

        atendenteRecepcionista.adicionaUsuario(usr03);
        atendenteRecepcionista.adicionaUsuario(usr04);
        atendenteRecepcionista.adicionaUsuario(usr05);
        atendenteRecepcionista.adicionaUsuario(usr06);

        atendenteRecepcionista.mostraFila();
        System.out.println("---");

        System.out.println("Atendido: ");
        System.out.println(atendente01.retiraUsuario().toString());
        System.out.println("---");

        atendente01.mostraFila();
        System.out.println("---");

        System.out.println("Atendido: ");
        System.out.println(atendente02.retiraUsuario().toString());
        System.out.println("---");

        atendente02.mostraFila();
        System.out.println("---");
    }
}
