//write a java program that calculates the factorial of n using a while loop.The input is entered by the user
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Display result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }
}
