import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
public class Principal {
    
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.add("Pedro");

        Collections.sort(nomes);
        System.out.println(nomes);

        HashSet<String> listaNaoDuplicada = new HashSet<>(nomes);
       

        System.out.println(listaNaoDuplicada);
    }
}
