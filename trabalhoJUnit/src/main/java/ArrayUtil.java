import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ArrayUtil {

    public static int soma(int vetor[]){
        int resultado = 0;
        for(int i = 0; i < vetor.length; i++){
            resultado += vetor[i];
        }
        return resultado;
    }
    public static int menor(int vetor[]){
        int menor = MAX_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i]< menor){
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int maior(int vetor[]){
        int maior = MIN_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int negativo(int vetor[]){
        int qtdNegativos = 0;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                qtdNegativos++;
            }
        }
        return qtdNegativos;
    }

    public static boolean par(int vetor[]){
        boolean par = true;
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] %2 != 0){
                par = false;
            }
        }
        return par;
    }

    public static int busca(int vetor[], double alvo){
        int posicao;
        for (int i = 0; i < vetor.length; i++){
            if
        }
    }

}
