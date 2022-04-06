import java.util.Scanner;
import java.util.Arrays;
public class ArraysSort {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args){
        //2 formas criar array: int[] valores = new int[5]; // int[] valores; valores = new int[qtd]
        int[] valores;
        
        System.out.println("Digite a quantidade de valores: ");
        int qtd = leitor.nextInt();
        
        valores = new int[qtd];
        
        for(int i = 0; i<valores.length; i++){
            System.out.println("Digite o valor do número "+(i+1)+": ");
            valores[i]=leitor.nextInt();
        }
        
        Arrays.sort(valores);
        for(int i = 0; i<valores.length; i++){
            System.out.println(valores[i]);
        } 
      
    }
    
}

