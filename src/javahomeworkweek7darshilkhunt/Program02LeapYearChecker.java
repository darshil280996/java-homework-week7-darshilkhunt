package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Program02LeapYearChecker {

    public static void main(String[] args) {

        Scanner lyc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = lyc.nextInt();
        lyc.close();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
    }
}
