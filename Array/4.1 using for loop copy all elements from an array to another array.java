import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = {5,6,7,8,9};
        System.out.println("Before swap = "+ Arrays.toString(sourceArray));


        for (int i = 0; i < sourceArray.length; i++) {
            int temp = sourceArray[i];
            sourceArray[i]=destinationArray[i];
            destinationArray[i] = temp;

        }

        System.out.println("After swap = "+ Arrays.toString(sourceArray));
    }
}
