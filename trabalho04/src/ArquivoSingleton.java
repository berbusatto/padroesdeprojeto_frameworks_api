import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ArquivoSingleton {
    private static ArquivoSingleton instance;
    private File arquivo;

    private ArquivoSingleton(){
        arquivo = new File("txt/Teste.txt");
    }

    public static ArquivoSingleton getInstance(){
        if(!arquivo.exists()){
            new ArquivoSingleton();
        }
        return arquivo;
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
