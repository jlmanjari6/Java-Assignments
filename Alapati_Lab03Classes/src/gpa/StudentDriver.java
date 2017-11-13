/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 * There are 3 courses and each course is of 3 credit hours.
 * Final GPA is calculated as ((grade of course1)*(credit hours) + (grade of course2)*(credit hours)+ (grade of course3)*(credit hours))/credit hours * 3;
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        double gpa;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String fName = scannerObject.nextLine();
        System.out.println("Enter Last name: ");
        String lName = scannerObject.nextLine();
        System.out.println("Enter Student Identification Number: ");
        String sId = scannerObject.nextLine();
        System.out.println("Enter course1 Grade1: ");
        String grade1 = scannerObject.nextLine();
        System.out.println("Enter course1 Grade2: ");
        String grade2 = scannerObject.nextLine();
        System.out.println("Enter course1 Grade3: ");
        String grade3 = scannerObject.nextLine();              
        
        Student studentDetails = new Student();
        double studentGrade1 = studentDetails.pointsGraded(grade1);
        double studentGrade2 = studentDetails.pointsGraded(grade2);
        double studentGrade3 = studentDetails.pointsGraded(grade3);
        
         if(studentGrade1== -1 || studentGrade2== -1 || studentGrade3== -1 )
         {
             System.out.println("Incorrect grades. Please try again!");
         }
         else
         {
             Student calculate = new Student(fName, lName, sId, studentGrade1, studentGrade2, studentGrade3);
             gpa = calculate.calculateGPA(studentGrade1, studentGrade2, studentGrade3);
             System.out.println("Student Details are as follows: ");
             System.out.println(calculate.toString());
             System.out.println("Your final GPA is: " + gpa);
         }
         
    }
    
}
