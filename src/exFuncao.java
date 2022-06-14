import java.util.Scanner; // chatice do java
public class ExFuncao {
    


  static Scanner leitor = new Scanner(System.in);

  //função 01
  static void boasVindas(){
    System.out.println("Olá");
    System.out.println("Seja bem vindo!");
  }

  //função 02
  static int digitaValor(){
    System.out.println("Digite um valor: ");
    int var = leitor.nextInt();
    return var;

  }

  //função soma
  static int calculaSoma(int a, int b){
  int var = a + b;
  return var;
  }

  //função multiplicação
  static int calculaMultiplica(int a, int b){
    int var = a * b;
    return var;
  }
  
  //FUNÇÃO PRINCIPAL
    public static void main(String[] args) {
      
    
      // boas vindas
      boasVindas();

      int var1, var2, var3;
      //criação das variáveis
      
      
      var1 = digitaValor();

      var2 = digitaValor();

      var3 = digitaValor();

      //operação soma
      int var4 = calculaSoma(var1, var2);

      //operação multiplicação
      int var5 = calculaMultiplica(var2, var3);

      //impressão
      System.out.println ("Valor 1: " + var1);
      System.out.println ("Valor 2: " + var2);
      System.out.println ("Valor 3: " + var3);
      System.out.println ("Valor 4: " + var4);
      System.out.println ("Valor 5: " + var5);
      


    
      }
}
    

