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
public class NoFineException extends Exception {

    /**
     * Creates a new instance of <code>NoFineException</code> without detail
     * message.
     */
    public NoFineException() {
    }

    /**
     * Constructs an instance of <code>NoFineException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoFineException(String msg) {
        super(msg);
    }
}
