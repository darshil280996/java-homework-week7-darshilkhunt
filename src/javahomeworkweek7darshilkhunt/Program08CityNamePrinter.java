package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program08CityNamePrinter {
    public static void main(String[] args) {
        Scanner cnp = new Scanner(System.in);

        System.out.println("Enter an Alphabet (A to F): ");
        char alphabet = cnp.next().toUpperCase().charAt(0);

        String cityName;

        if (alphabet == 'A'){
            cityName = "Amsterdam";
        } else if (alphabet == 'B') {
            cityName = "Berlin";
        } else if (alphabet == 'C') {
            cityName = "Chicago";
        } else if (alphabet == 'D') {
            cityName = "Dublin";
        } else if (alphabet == 'E') {
            cityName = "Edingurgh";
        } else if (alphabet == 'F') {
            cityName = "Frankfurt";
        } else {
            cityName = "Invalid Entry";
        }

        System.out.println("City Name: " + cityName);
        cnp.close();
    }
}
