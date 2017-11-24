/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class RecursionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Recursion recur = new Recursion();
        ArrayList<Student> stuList = new ArrayList<>();
        ArrayList<ArrayList<Student>> finalList;
        System.out.println("Please enter the number of odd numbers you want to add: ");
        int n = sc.nextInt();
        System.out.println("The sum of " + n + " odd numbers is " + recur.sumOfOdd(n));
        System.out.println("Please enter the number of Students.");
        int numOfstu = sc.nextInt();
        System.out.println("Please enter the list of Students for which you "
                + "want to find the seating arrangements. ");
        while (numOfstu != 0) {
            Student s = new Student(sc.next());
            stuList.add(s);
            numOfstu--;
        }
        System.out.println("The list is: ");
        finalList = recur.organizeSeats(stuList);
        for (ArrayList<Student> s : finalList) {
            System.out.println(s);
        }

        System.out.println("Please enter the names of the students that the instructor doesn't want sitting next to each other: ");
        finalList = recur.organizeSeats(stuList, sc.next(), sc.next());
        System.out.println("The possibilities of restricted arrangement:");
        for (ArrayList<Student> s : finalList) {
            System.out.println(s);
        }
      
         try {
            System.out.println(recur.evaluateExpression("(1+2)"));
            System.out.println(recur.evaluateExpression("(1+3)/2+5"));
            System.out.println(recur.evaluateExpression("(2+4)*((3*2)-(2/4)+(9%4))"));
            System.out.println(recur.evaluateExpression("(2+4)/((7/3)+(2*4))+(8*4)/((9-2)-(-8*9))"));
            System.out.println(recur.evaluateExpression("(3-1)/((3%3)/(-3*4)+(-7/6)%(-9/5))"));
        } catch (Exception ex) {
            System.out.println("Exception thrown! " + ex.getMessage());
        }
    }

}
