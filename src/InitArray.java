public class InitArray {
    public static void main(String[] args){
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1); // exibe array1 por linha

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // exibe array2 por linha
    }

    // gera saída de linhas e colunas de um array bidimensional
 public static void outputArray(int[][] array)
 {
// faz um loop pelas linhas do array ÿ
for (int row = 0; row < array.length; row++) 
{ 
 // faz um loop pelas colunas da linha atual ÿ
 for (int column = 0; column < array[row].length; column++)
 System.out.printf("%d ", array[row][column]); 

 System.out.println(); 
} 
 }
 } // fim da classe InitArray

