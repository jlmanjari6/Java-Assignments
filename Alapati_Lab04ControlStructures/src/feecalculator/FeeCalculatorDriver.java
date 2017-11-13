/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feecalculator;

import java.util.Scanner;

/**
 * To develop the fee calculator for non-resident MS-ACS graduate students who enroll courses at Northwest Missouri State University.
 * This calculator shall calculate the total amount that students have to pay to the university. This would include the scholarship amounts also.
 * @author Lakshmi Manjari Alapati
 * @version 25th Sep, 2017
 */
public class FeeCalculatorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean attempt;
        double gpa = 0.0;
        
        System.out.println("*******************************\n" +
                "***Northwest Cost Calculator***\n" +
                "*******************************");
        
        do
        {
        System.out.println("Please enter the full name (Firstname Lastname):");
        String studentName = scan.nextLine();
        while(studentName.trim().equals(""))
        {
            System.out.println("Please enter your name again!");
            studentName = scan.nextLine();
        }
        
        System.out.println("Please enter the number of pre-requisites: ");
        double noOfPreReq = Double.parseDouble(scan.nextLine());
        
        while(!(noOfPreReq== 0 ||  noOfPreReq ==1 || noOfPreReq ==2))
        {
        System.out.println("You have entered invalid number, please re-enter either 0 or 1 or 2: ");
        noOfPreReq = Double.parseDouble(scan.nextLine());
        }
        
        System.out.println("Please enter the number of semesters you want to calculate the cumulative fee: ");
        double semesters = Double.parseDouble(scan.nextLine());
        while(!(semesters == 1 || semesters == 2 || semesters == 3|| semesters == 4))
        {
        System.out.println("You have entered invalid number, please re-enter either 1 or 2 or 3 or 4: ");
        semesters = Double.parseDouble(scan.nextLine());
        }
        
        if(semesters != 1)
        {
        System.out.println("Enter the cumulative GPA: ");
        gpa = Double.parseDouble(scan.nextLine());
        while(!(gpa>= 0 && gpa <= 4))
        {
        System.out.println("The GPA value should be in between 0 and 4, please re-enter: ");
        gpa = Double.parseDouble(scan.nextLine());
        }
        }
        
        FeeCalculator fee = new FeeCalculator(studentName);
        System.out.println("****************************************");
        System.out.println("* Hello, " + fee.getNameInitials());
        System.out.println("*------------------------------------\n" +
                            "* Your Account Summary\n" +
                            "*------------------------------------\n*__________________________________");
        for(int i=1;i<= (int) semesters;i++)
        {
            System.out.println("* Semester " + i + " fee is: $ " + String.format("%8.2f", fee.calcSemCost(i, (int) noOfPreReq, gpa)) + "  *");
        }
        double totalCost = fee.calcTotalCost((int) semesters,(int) noOfPreReq, gpa);
        System.out.println("*----------------------------------");
        System.out.println("* Total cost:      $ " + String.format("%8.2f", totalCost));
        System.out.println("*----------------------------------    ");
        System.out.println("*");
        System.out.println("* USD to INR: Rs. " +  String.format("%8.2f", fee.exchUSDToINR(totalCost)));
        System.out.println("* USD to Euro: € " +  String.format("%8.2f", fee.exchUSDToEuro(totalCost)));
        System.out.println("****************************************");
        System.out.println(fee.printReceipt((int) semesters, (int) noOfPreReq, gpa));
        System.out.print("Do you want to calculate again?(Y/N): ");
        String response = scan.nextLine();
        attempt = (response.trim().toLowerCase().equals("y"));       
        }
        while(attempt == true);
        
        System.out.println("Thank You! All the best.");
        scan.close();
    }
    
}
