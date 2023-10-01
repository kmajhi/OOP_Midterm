import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent number: ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i = 0; i <exponent; i++) {
            result = result*base;
        }
        System.out.println("The power of " + base + "^" + exponent + " is = " + result);
    }
}
