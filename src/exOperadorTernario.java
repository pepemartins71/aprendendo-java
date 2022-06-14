import java.util.Scanner; // chatice do java
public class ExOperadorTernario {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);// obs dentrada
      
       int numeroDias = texto.nextInt(); //valor entre 1 e 30
        System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");
      

      
      
        texto.close();
      }
}

