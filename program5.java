//Write a java program to input an integer n and print whether the number is prime or not using a loop
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        boolean isPrime = true;

        // Handle edge cases
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to n-1
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
