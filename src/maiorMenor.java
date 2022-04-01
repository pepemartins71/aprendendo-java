import java.util.Scanner;
public class maiorMenor {
    

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int v1, v2;

    System.out.println("Digite um número: ");
    v1 = leitor.nextInt();
    System.out.println("Digite outro número: ");
    v2 = leitor.nextInt();

    if(v1>v2 && v1 != v2){
    System.out.println("O número "+v1+ " é maior que o número "+v2);
      }else if(v2>v1 && v2 != v1){
    System.out.println("O número "+v2+ " é maior que o número "+v1);
      }else{
      System.out.println("Os números são iguais!");
      }
      
      leitor.close();
      }
  }

