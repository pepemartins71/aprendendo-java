import java.util.Scanner;
public class difHorarios {
    

  public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);
    
     int h, min, seg, h2, min2, seg2, segt1, segt2, dif;

     System.out.println("Informe o horário 1 (horas, minutos e segundos): ");
     h = leitor.nextInt();
     min = leitor.nextInt();
     seg = leitor.nextInt();

     System.out.println("Informe o horário 2 (horas, minutos e segundos): ");
     h2 = leitor.nextInt();
     min2 = leitor.nextInt();
     seg2 = leitor.nextInt();

     segt1 = (h * 3600) + (min * 60) + seg;

     segt2 = (h2 * 3600) + (min2 * 60) + seg2;

     dif = segt2 - segt1;

     System.out.println("A diferença entre os horários é de "+dif+" segundos!");

        
    leitor.close();
  }
}

