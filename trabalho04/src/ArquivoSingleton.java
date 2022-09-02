

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ArquivoSingleton {

    private File arquivo;
    private FileWriter fileW;
    private BufferedWriter bufferW;

    private static ArquivoSingleton instancia;


    private ArquivoSingleton() {   //CONSTRUTOR

        arquivo = new File("txt/Teste.txt");

        if (!arquivo.exists()){
            try {
                this.arquivo.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static ArquivoSingleton getInstancia(){

        if(instancia == null){
            instancia = new ArquivoSingleton();
        }
        return instancia;
    }

    public void gravaArquivo(String texto) {
        try {
            this.fileW     = new FileWriter(arquivo, true );
            this.bufferW   = new BufferedWriter(fileW);

            this.bufferW.write(texto);
            this.bufferW.newLine();

            this.bufferW.close();
            this.fileW.close();
        }
        catch (Exception e) { // PEGA UMA EXCESS //'e' E UM OBJETO
            System.out.println(e.getMessage());
        }
    }



}