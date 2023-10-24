package javahomeworkweek7darshilkhunt;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Program20ArrayContainsValue {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Specify the value to check for
        int targetValue = 15;

        // Initialize a flag to indicate if the value is found
        boolean found = false;

        // Iterate through the array to check for the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Exit the loop early if the value is found
            }
        }

        // Check and print the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
