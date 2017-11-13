/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Exception thrown when invalid number of courses are assigned to Students
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017.
 */
public class InvalidNumberOfCourses extends Exception {

    /**
     * Creates a new instance of InvalidNumberOfCourses without detail message.
     */
    public InvalidNumberOfCourses() {
        super();
    }

    /**
     * Constructs an instance of InvalidNumberOfCourses with the specified
     * detail message.
     *
     * @param message
     */
    public InvalidNumberOfCourses(String message) {
        super(message);
    }

}
