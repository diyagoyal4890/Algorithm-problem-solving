//Write a java program to check whether a given number is divisible by both 5 and 7 but not divisible by 11.Use appropriate decision-making statements
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility conditions
        if (number % 5 == 0 && number % 7 == 0 && number % 11 != 0) {
            System.out.println(number + " is divisible by both 5 and 7 but not divisible by 11.");
        } else {
            System.out.println(number + " does not meet the criteria.");
        }
    }
}
