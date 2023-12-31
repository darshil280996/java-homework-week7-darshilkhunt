package javahomeworkweek7darshilkhunt;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Program03StudentMarkSheet {

    public static void main(String[] args) {
        Scanner sms = new Scanner(System.in);

        //Input Student Information
        System.out.println("Enter Student Name: ");
        String name = sms.nextLine();
        System.out.println("Enter Roll Number: ");
        int rollNo = sms.nextInt();
        System.out.println("Enter Math Marks (0-100): ");
        int mathMarks = sms.nextInt();
        System.out.println("Enter Science Marks (0-100): ");
        int scienceMarks = sms.nextInt();
        System.out.println("Enter English Marks (0-100): ");
        int englishMarks = sms.nextInt();

        sms.close();

        // Check if marks are within valid range

        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        // Calculate total and percentage

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks * 100.0) / 300;

        //Determine the result & grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = "N/A";

        if (percentage >= 80){
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }

        //Print the Mark Sheet
        System.out.println("_______________________________");
        System.out.println("|                           |");
        System.out.println("|       Mark Sheet          |");
        System.out.println("|____________________________|");
        System.out.println("| Name : " + name);
        System.out.println("| Roll No: " + rollNo);
        System.out.println("|____________________________|");
        System.out.println("| Subjects : Marks           |");
        System.out.println("|____________________________|");
        System.out.println("| Math : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|____________________________|");
        System.out.println("| Total : " + totalMarks);
        System.out.println("|____________________________|");
        System.out.println("| Percentage : " + String.format("%.1f", percentage) + " %");
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|____________________________|");
    }
}
