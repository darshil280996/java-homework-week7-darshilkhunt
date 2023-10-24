package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even.
 */

public class Program06OddEvenChecker {
    public static void main(String[] args) {
        Scanner oec = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int number = oec.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        oec.close();
    }
}
