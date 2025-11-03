//Write a java program that finds the sum of the sum of the digits of a number n, where n is entered by the user.For example for n=12,3,45 the sum of the digits should be 15 
import java.util.Scanner;

public class DigitSumAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter numbers separated by commas (e.g., 12,3,45): ");
        String input = scanner.nextLine();

        // Split input into individual numbers
        String[] numbers = input.split(",");

        int totalSum = 0;

        // Process each number
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr.trim());
            totalSum += sumOfDigits(num);
        }

        // Output the result
        System.out.println("Total sum of digits: " + totalSum);
    }

    // Helper method to calculate sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
