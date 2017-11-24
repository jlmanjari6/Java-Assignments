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
public class UnderAgeException extends Exception {

    /**
     * Creates a new instance of <code>UnderAgeException</code> without detail
     * message.
     */
    public UnderAgeException() {
    }

    /**
     * Constructs an instance of <code>UnderAgeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnderAgeException(String msg) {
        super(msg);
    }
}
