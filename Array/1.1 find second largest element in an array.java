import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 7};

        System.out.println("Before sorting array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("This is a sorted array: " + Arrays.toString(arr));

        int secondLargest = arr.length-2;
        System.out.println("The second largest number is = "+  arr[secondLargest]);
    }
}
