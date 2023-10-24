package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program07SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);

        //Input Sales Information
        System.out.println("Enter Sales ID: ");
        int salesId = scc.nextInt();
        scc.nextLine();

        System.out.println("Enter Seller's Name: ");
        String sellerName = scc.nextLine();

        System.out.println("Enter Sales Amount: ");
        double salesAmount = scc.nextDouble();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scc.nextDouble();

        //Calculate Sales Commission based on sales amount
        double commissionRate = 0.0;

        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double commission = salesAmount * commissionRate;

        // Print sales commission
        System.out.println("_______________________________");
        System.out.println("| Sales Commission Report |");
        System.out.println("|______________________________|");
        System.out.println("| Sales ID: " + salesId + " |");
        System.out.println("| Seller's Name: " + sellerName + " |");
        System.out.println("| Sales Amount: " + salesAmount + " |");
        System.out.println("| Basic Salary: " + basicSalary + " |");
        System.out.println("|______________________________|");
        System.out.println("| Sales Commission Rate: " + (commissionRate * 100) + "% |");
        System.out.println("| Commission Amount: " + commission + " |");
        System.out.println("|===========================|");

        scc.close();
    }
}
