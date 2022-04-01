import java.util.Scanner;
public class volumeEsfera {
    
  static Scanner leitor = new Scanner(System.in);

  //função calcular volume
  static double calculaVolume(double r){
    double v = (4*Math.PI*Math.pow(r, 3))/3;
    return v;
  }

  public static void main(String[] args){
    double raio;
    double volume;

    System.out.println("Digite o raio da esfera (em metros): ");
    raio = leitor.nextDouble();

    volume = calculaVolume(raio);

    System.out.println("O valor do volume da esfera de raio "+raio+" é de "+volume);
  }

}

