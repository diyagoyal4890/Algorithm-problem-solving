//write a java program that calculates the Greatest common divisor(GCD) of two numbers entered by the user using a while loop
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Use Euclidean algorithm with a while loop
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Output the result
        System.out.println("GCD is: " + a);
    }
}
