/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This class extends the Exception class 
 * @author Lakshmi Manjari Alapati
 */
public class MaximumLimitException extends Exception {

    /**
     *
     */
    public MaximumLimitException() {
    }

    /**
     *
     * @param message
     */
    public MaximumLimitException(String message) {
        super(message);
    }
    
}
