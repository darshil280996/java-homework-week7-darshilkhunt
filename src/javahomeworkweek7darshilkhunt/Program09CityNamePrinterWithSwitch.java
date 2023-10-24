package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class Program09CityNamePrinterWithSwitch {
    public static void main(String[] args) {
        Scanner cnp = new Scanner(System.in);

        System.out.println("Enter an Alphabet (A to F): ");
        char alphabet = cnp.next().toUpperCase().charAt(0);

        String cityName;

        switch (alphabet){
            case 'A':
                cityName = "Amsterdam";
                break;
            case 'B':
                cityName = "Berlin";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Dublin";
                break;
            case 'E':
                cityName = "Edinburgh";
                break;
            case 'F':
                cityName = "Frankfurt";
                break;
            default:
                cityName = " Invalid Entry";
        }

        System.out.println("City Name: " + cityName);

        cnp.close();
    }
}
