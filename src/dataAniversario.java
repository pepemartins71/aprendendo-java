import java.util.Scanner; // chatice do java
public class dataAniversario {
   


    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);// obs dentrada
        System.out.println ("Digite sua data de nascimento (no formato dd mm aaaa, um de cada vez):");
      int dia = texto.nextInt();
      int mes = texto.nextInt();
      int ano = texto.nextInt();

      if(mes == 01){
       System.out.println ("Sua data de nascimento é dia " + dia + " de " + "janeiro de " + ano + "!"); 
      }

      if(mes == 03){
       System.out.println ("Sua data de nascimento é dia " + dia + " de " + "março de " + ano + "!"); 
      }
      
        texto.close();
      }
}

