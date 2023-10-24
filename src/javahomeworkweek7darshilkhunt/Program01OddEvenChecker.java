package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Program01OddEvenChecker {

    public static void main(String[] args) {
        Scanner oec = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = oec.nextInt();
        oec.close();

        String result = ( number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + "is" + result);


    }
}
