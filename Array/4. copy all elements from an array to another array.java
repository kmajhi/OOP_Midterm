import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int [] arr2 = {5,6,7,8,9};
      
        System.out.println("Before swap values = "+ Arrays.toString(arr));
      
        int temp[]= arr;
        arr = arr2;
        arr2 = temp;
      
        System.out.println("After swap vlaues = " + Arrays.toString(arr));
    }
}
