import java.util.Scanner;
public class ArrayMultidimensional {

    public static void main(String[] args) {
        int[][] numeros = new int[3][4];

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<numeros.length; i++)
            for(int j=0; j<numeros[i].length; j++){
                System.out.println("Digite o valor da posição "+i+" "+j);
                numeros[i][j] = leitor.nextInt();
            }

        for(int i=0; i<numeros.length; i++)
            for(int j=0; j<numeros[i].length; j++){
                System.out.printf("%d ", numeros[i][j]);
                System.out.println();
            }



            
            leitor.close();
    }
    
}
