import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 7};
        Arrays.sort(arr);
        System.out.println("The second largest number is = "+  arr[arr.length-2]);
    }
}
