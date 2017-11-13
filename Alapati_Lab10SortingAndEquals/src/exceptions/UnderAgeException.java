/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Exception thrown while assigning an item or dvd to member whose age is less
 * than specified age
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class UnderAgeException extends Exception {

    /**
     * Creates a new instance of UnderAgeException without detail message.
     */
    public UnderAgeException() {
        super();
    }

    /**
     * Creates a new instance of UnderAgeException with the specified detail
     * message.
     *
     * @param message
     */
    public UnderAgeException(String message) {
        super(message);
    }
}
