import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] numbers = {2, 1, 4, 5, 3, 0};
        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers, 6));

    }
    
}
