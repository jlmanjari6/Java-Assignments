/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class CourseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //Create a Scanner object to read Student and course details from "input.txt" file.
        Scanner sc = new Scanner(new File("input.txt"));

        //Create an object of CourseMapping and name it as "enrollments".
        CourseMapping enrollments = new CourseMapping();

        //Declare an object for Person, name it as "student" and initialize it to null
        Person student = null;
        //while input.txt has more data(While loop starts here) {
        while (sc.hasNext()) {
            Course course = null;
            if ((sc.nextLine().equals("Student"))) {
                student = new Person(sc.nextLine());

            } else {
                String[] courses = sc.nextLine().split("-");
                course = new Course(courses[0], courses[1], new Person(courses[2]));
                enrollments.addEnrollments(student, course);

            }

        }
        System.out.println("Number of students enrolled in 44460 in Fall 2016 with Dr. Charles Badami" + "\n"
                + enrollments.findNumberOfStudents("Charles Badami", "Fall 2016", "44460"));
        System.out.println("Courses taught by Dr. Aziz Fellah: " + "\n" + enrollments.findCoursesTaught("Aziz Fellah"));
        System.out.println("Students enrolled for 44692 in Fall 2017\n" + enrollments.findStudentsEnrolled("44692", "Fall 2017"));
        System.out.println("Size of hash map: " + enrollments.size());
        //Read the first line,If the passed type is "Student" then, read in the "name".

        //Create an object for Person with above read value and assign it to "student" variable.
        //Else, read the next line, It will be in the following order: courseNo, faculty name and semester 	//separated by comma separator.
        // With above read values, create an object Course and name it as "course".
        //Invoke addEnrollments() on "enrollments" object and add the "student","course".
        // } (while loop ends here)
        // Print number of students enrolled in "44460" in "Fall 2016" with "Charles Badami"
        // Print courses taught by "Aziz Fellah"
        // Print students enrolled for "44692" in "Fall 2017"
        // Print size of the hash map.
    }

}
