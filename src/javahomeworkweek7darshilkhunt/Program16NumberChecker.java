package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Program16NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }

        scanner.close();
    }
}
