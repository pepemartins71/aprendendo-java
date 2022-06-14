import java.util.Scanner;
public class OrdenaNum {
    

    
        public static void main(String args[]) {
          Scanner x = new Scanner(System.in);
          
          int v1,v2,v3;
        
          System.out.println("Informe o primeiro valor:");
          v1 = x.nextInt();
          
          System.out.println("Informe o segundo valor:");
          v2 = x.nextInt();
          
          System.out.println("Informe o terceiro valor:");
          v3 = x.nextInt();
          
          if (v1 < v2 && v1 < v3)
          {
            System.out.println(v1);     
            if (v2<v3){     
               System.out.println(v2);
               System.out.println(v3);
             }
            else{     
              System.out.println(v3);
              System.out.println(v2);
             }
          }
          else if (v2<v1 && v2<v3)
            {
              System.out.println(v2);
              if (v1<v3){     
                System.out.println(v1);
                System.out.println(v3);
              }
              else
              {     
                System.out.println(v3);
                  System.out.println(v1);
              }
            }
          else
            {
              System.out.println(v3);
              if (v1<v2){
                  System.out.println(v1);
                  System.out.println(v2);
              }
              else
              {
                  System.out.println(v2);
                  System.out.println(v1);
              }
        
          }
           x.close();  
        }
        
    }    

