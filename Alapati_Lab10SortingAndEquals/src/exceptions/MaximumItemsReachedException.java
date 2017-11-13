/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Exception thrown when items added are more than the size of array length
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class MaximumItemsReachedException extends Exception {

    /**
     * Creates a new instance of MaximumItemsReachedException without detail
     * message.
     */
    public MaximumItemsReachedException() {
        super();
    }

    /**
     * Constructs an instance of MaximumItemsReachedException with the specified
     * detail message.
     *
     * @param message
     */
    public MaximumItemsReachedException(String message) {
        super(message);
    }
}
