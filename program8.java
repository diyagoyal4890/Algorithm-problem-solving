//Write a java program that reads a number n and finds the sum of all numbers divisible by 2 or 3 between 1 and n without using arrays.Write a java program that accepts a number n and prints all the divisors of n using a for loop
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Part 1: Sum of numbers divisible by 2 or 3
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers divisible by 2 or 3 between 1 and " + n + " is: " + sum);

        // Part 2: Print all divisors of n
        System.out.println("Divisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
