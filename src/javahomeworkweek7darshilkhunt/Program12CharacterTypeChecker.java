package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.next();

        char character = input.charAt(0);

        if (Character.isDigit(character)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(character)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol or special character.");
        }

        scanner.close();
    }
}
