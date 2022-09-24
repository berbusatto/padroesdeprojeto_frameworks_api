

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ArquivoSingleton {

    private File arquivo;
    private static ArquivoSingleton instancia;


    private ArquivoSingleton() {   //CONSTRUTOR

        arquivo = new File("Teste.txt");

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
            FileWriter fileW;
            BufferedWriter bufferW;

            fileW     = new FileWriter(arquivo, true );
            bufferW   = new BufferedWriter(fileW);

            bufferW.write(texto);
            bufferW.newLine();

            bufferW.close();
            fileW.close();
        }
        catch (Exception e) { // PEGA UMA EXCESS //'e' E UM OBJETO
            System.out.println(e.getMessage());
        }
    }



}