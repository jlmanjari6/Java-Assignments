/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.MaximumLimitException;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************************");
        System.out.println("*****Student Data*****");
        System.out.println("*****************************");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the student first name: ");
        String fName = scan.nextLine();
        System.out.println("Please enter the student last name: ");
        String lName = scan.nextLine();
        System.out.println("Please enter the student Id: ");
        String sId = scan.nextLine();
        System.out.println("Please enter the student degree: ");
        String degree = scan.nextLine();

        if (degree.equals("Graduate")) {
            Student s = new GraduateStudent(fName, lName, sId);
            System.out.println("Please enter the courses you want to enroll seperated by commas: ");
            String courses = scan.nextLine();
            try {
                GraduateStudent grad = new GraduateStudent(fName, lName, sId);
                s.addCourses(courses);
                grad.calculateFee(grad.getCoursesList().size());
                System.out.println("List of courses added: ");
                for (String c : grad.getCoursesList()) {
                    System.out.println(c);
                }
                 System.out.println("Total fee:" + grad.getTotalFee());
            } catch (MaximumLimitException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (degree.equals("Under Graduate")) {
            System.out.println("Please enter the no of prerequisites ");
            int noOfPrereq = Integer.parseInt(scan.nextLine());
            Student s = new UndergraduateStudent(noOfPrereq, fName, lName, sId);
            System.out.println("Please enter the courses you want to enroll seperated by commas: ");
            String courses = scan.nextLine();
            try {   
                UndergraduateStudent undergrad = new UndergraduateStudent(noOfPrereq, fName, lName, sId);
                s.addCourses(courses);
                undergrad.calculateFee(undergrad.getCoursesList().size());
                System.out.println("List of courses added: ");
                for (String c : undergrad.getCoursesList()) {
                    System.out.println(c);
                }
                System.out.println("Total fee:" + undergrad.getTotalFee());
            } catch (MaximumLimitException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }
}
