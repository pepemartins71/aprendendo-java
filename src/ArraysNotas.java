import java.util.Scanner;
public class ArraysNotas {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        double[] notas;

        System.out.println("Digite a quantidade de notas: ");
        int qtd = leitor.nextInt();

        notas = new double[qtd];

        
        double maior=-1, menor=1000, soma=0;

        for(int i=0; i<notas.length; i++){
            System.out.println("Digite a nota "+(i+1)+": ");
            notas[i] = leitor.nextDouble();

        }

        for(int i=0; i<notas.length; i++){
                soma += notas[i];
            }

        for(int i=0; i<notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
              }

            }

        for(int i=0; i<notas.length; i++){
         if(notas[i] < menor){
             menor = notas[i];
            }
    
         }
          
        double media = soma/notas.length;

        System.out.println("O maior é: "+maior);
        System.out.println("O menor é: "+menor);
        System.out.println("A média é: "+media);
        System.out.println("A soma é: "+soma);

        }
    }

    

