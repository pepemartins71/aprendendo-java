import java.util.Scanner;
public class QuestaoSegTranscorrido {
    

  public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);
    
     int h, min, seg, segt, hsegnovo, resto;

     System.out.println("Informe o horário (horas, minutos e segundos): ");
     h = leitor.nextInt();
     min = leitor.nextInt();
     seg = leitor.nextInt();

     System.out.println("Informe os segundos transcorridos: ");
     segt = leitor.nextInt();

     hsegnovo = seg + segt;
     if(hsegnovo < 60){
       System.out.println("O horário é de "+h+" horas "+min+" minutos e "+hsegnovo+" segundos.");

     }else if(hsegnovo >=60){
       min = min + (hsegnovo / 60);
       resto = hsegnovo % 60;
       System.out.println("O horário é de "+h+" horas "+min+" minutos e "+resto+" segundos.");

     }else{
       System.out.println("Erro");
     }



     

        
    leitor.close();
  }
}

