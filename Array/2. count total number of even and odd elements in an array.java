import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int countEven=0 , countODD = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                countEven++;
            } else{
                countODD++;
            }
        }
        System.out.println("Total Even numbers = "+ countEven);
        System.out.println("Total Odd numbers= "+ countODD);
    }
}
