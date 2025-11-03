//Write a java program that takes an integer n and prints the sum of all the even numbers between 1 and n(inclusive)
import java.util.Scanner;

public class EvenSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop through numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        // Print the result
        System.out.println("Sum of even numbers between 1 and " + n + " is: " + sum);
    }
}
