package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Program10Calculator {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double number1 = cc.nextDouble();

        System.out.println("Enter Second Number: ");
        double number2 = cc.nextDouble();

        System.out.println("Enter mathematical operations(+, -, * , /): ");
        char operator = cc.next().charAt(0);

        double result;

        if (operator == '+'){
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 != 0){
                result = number1 / number2;
            } else {
                System.out.println("Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid Operator. Please Use =, -, *, /");
            return;
        }

        System.out.println("Result: " + number1 + " " + operator + " " + number2 + "=" + result);

        cc.close();
    }
}
