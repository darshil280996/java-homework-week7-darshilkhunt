package javahomeworkweek7darshilkhunt;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Program19ArrayAverage {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Initialize variables for sum and count
        int sum = 0;
        int count = numbers.length;

        // Calculate the sum of the array elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the average
        System.out.println("Average of the array elements: " + average);
    }
}
