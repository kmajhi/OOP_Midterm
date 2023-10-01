import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();

        System.out.print("Enter how many numbers you want to add = ");
        Scanner sc = new Scanner(System.in);
        int xNumber = sc.nextInt();

        for (int i=1; i<=xNumber; i++){
            System.out.print("Enter the "+ i + " number = ");
            int arrayListNumbers = sc.nextInt();
            num.add(arrayListNumbers);
        }
        Collections.sort(num);
        if (num.size() >= 2) {
            int secondLargest = num.get(num.size() - 2);
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There are not enough numbers to find the second largest.");
        }
    }
}
