package javahomeworkweek7darshilkhunt;

/**
 * Write a Java program to sum values of an array.
 */

public class Program18ArraySum {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
