import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ArquivoSingleton {
    private static ArquivoSingleton instance;
    private File arquivo;

    private ArquivoSingleton(){
        arquivo = new File("Teste.txt");

        if(!arquivo.exists()){
            try{
                this.arquivo.createNewFile();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }



    public static ArquivoSingleton getInstance(){

        if (instance == null){
            instance = new ArquivoSingleton();
        }
        return instance;
    }


    public void gravaArquivo(String texto) {
        FileWriter fileW;
        BufferedWriter bufferW;

        try {
            fileW     = new FileWriter(arquivo, true );
            bufferW   = new BufferedWriter(fileW);

            bufferW.write(texto);
            bufferW.newLine();

            bufferW.close();
            fileW.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
