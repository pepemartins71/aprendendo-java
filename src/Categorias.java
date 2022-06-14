import java.util.Scanner; // chatice do java
public class Categorias {
    
    public static void main(String[] args) {
        System.out.println("Olá! Seja bem vindo!"); // saída padrão!
        System.out.println("Digite a sua idade!"); // saída padrão
        Scanner leitor = new Scanner(System.in);// obs dentrada
        int idade = leitor.nextInt(); // entrada padrão

        // Declaração condicional (estrutura de decisão)
        if(idade < 12){
            System.out.println("CATEGORIA: Infantil");
        }else if(idade < 16){
            System.out.println("CATEGORIA: Juvenil");
        }else if(idade < 20){
          System.out.println("CATEGORIA: Júnior");
        }else if(idade < 45){
            System.out.println("CATEGORIA: Adulto");
        }else if (idade < 60){
          System.out.println("CATEGORIA: Senior");
          }else{
          System.out.println("CATEGORIA: Ancião");
          }
          leitor.close();
      }
}

