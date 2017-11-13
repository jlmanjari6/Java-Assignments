/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Exception thrown when return date is less than due date
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017.
 */
public class NoFineException extends Exception {

    /**
     * Creates a new instance of NoFineException without detail message.
     */
    public NoFineException() {
        super();
    }

    /**
     * Creates a new instance of NoFineException with the specified detail
     * message.
     *
     * @param message
     */
    public NoFineException(String message) {
        super(message);
    }
}
