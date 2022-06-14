import java.util.Scanner;
public class TreinandoArray {
    


  static Scanner leitor = new Scanner(System.in);

public static void main(String[] args){
int n;

  System.out.println("Digite a qtd. de temperaturas: ");
  n = leitor.nextInt();
  double[] temperaturas = new double[n];

  for(int i=0; i<n; i++){
    System.out.println("Digite temperatura "+(i+1));
    temperaturas[i] = leitor.nextDouble();
  }

  double media = 0;
  for(int i=0; i<n; i++){
    media = media + temperaturas[i];
  }

  media = media / n;
  System.out.println("Média: "+media);
  }

}

