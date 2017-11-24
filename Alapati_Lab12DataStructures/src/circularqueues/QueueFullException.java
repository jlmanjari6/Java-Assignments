/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueues;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class QueueFullException extends Exception {

    /**
     * Creates a new instance of <code>QueueFullException</code> without detail
     * message.
     */
    public QueueFullException() {
    }

    /**
     * Constructs an instance of <code>QueueFullException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public QueueFullException(String msg) {
        super(msg);
    }
}
