//Write a java program to reverse a number n using a loop.For example for n=1234,the output should be 4321
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int reversed = 0;

        // Reverse the number using a loop
        while (n != 0) {
            int digit = n % 10;       // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            n /= 10;                  // Remove last digit
        }

        // Display result
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
