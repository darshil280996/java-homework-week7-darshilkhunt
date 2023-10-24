package javahomeworkweek7darshilkhunt;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program17ArraySorter {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 1, 8, 2, 10};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
