import java.util.Scanner;
public class ExDoWhile{
    
  static Scanner leitor = new Scanner(System.in);

public static void main(String[] args){

int n;

do{
  System.out.println("Digite um número: ");
  n = leitor.nextInt();

}while(n<=0);

System.out.println("O número "+n+" é positivo.");

}

}

