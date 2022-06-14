import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     
       Scanner leitor = new Scanner(System.in);
      
      double emprestimo, parcela_emprestimo, juros, porcentagem;
      int parcelas;
      
      System.out.println("Quanto será de juros: ");
      juros = leitor.nextDouble();
      
      System.out.println("Quanto será o emprestimo: ");
      emprestimo = leitor.nextDouble();
      
      System.out.println("Quantas parcelas: ");
      parcelas = leitor.nextInt();
      
      porcentagem = juros/100;
      
      parcela_emprestimo = (emprestimo * (1+porcentagem))/parcelas;
      
      System.out.println("O emprestimo de "+emprestimo+" reais será pago em "+parcelas+" parcelas de "+parcela_emprestimo+" R$.");
      
      
    }
}