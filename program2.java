//write a java program that reads an integer n and checks if it is a palindromic number
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindromic number.");
        } else {
            System.out.println(n + " is not a palindromic number.");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // Compare original and reversed
        return original == reversed;
    }
}
