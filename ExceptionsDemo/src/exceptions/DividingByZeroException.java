/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author S530719
 */
public class DividingByZeroException extends Exception {

    public DividingByZeroException() {
        super();
    }

    public DividingByZeroException(String message) {
        super(message);
    }

}
