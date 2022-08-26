package filaBancoSingleton;

import java.util.ArrayList;

public class FilaSingleton {
    private static FilaSingleton instancia;
    private ArrayList<Usuario> filaUsuario = new ArrayList<>();

    private FilaSingleton() {
    }

    public static FilaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new FilaSingleton();
        }
        return instancia;
    }
    public void adicionaUsuario(Usuario user){
        this.filaUsuario.add(user);
    }

    public Usuario retiraUsuario(){
        return this.filaUsuario.remove(0);
    }

    public void mostraFila(){
        for (Usuario user : filaUsuario){
            System.out.println(user.toString());
        }
    }


}



