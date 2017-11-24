/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Vineeth Agarwal
 */
public class InvalidNumberOfCourses extends Exception {

    /**
     * Creates a new instance of <code>InvalidNumberOfCourses</code> without
     * detail message.
     */
    public InvalidNumberOfCourses() {
    }

    /**
     * Constructs an instance of <code>InvalidNumberOfCourses</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidNumberOfCourses(String msg) {
        super(msg);
    }
}
