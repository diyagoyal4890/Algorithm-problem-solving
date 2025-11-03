//Write a java program that reads a number n and checks if it is a strong number.A string number is one where the sum of the factorial of its digits equals the number itself.Forexample 145 is a strong number because 1!+4!+5!=145
import java.util.Scanner;

public class StrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int original = n;
        int sum = 0;

        // Calculate sum of factorials of digits
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        // Check if it's a strong number
        if (sum == original) {
            System.out.println(original + " is a strong number.");
        } else {
            System.out.println(original + " is not a strong number.");
        }
    }

    // Helper method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
