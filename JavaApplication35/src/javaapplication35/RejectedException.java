/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author S530719
 */
public class RejectedException extends Exception {

    public RejectedException() {
    }

   public RejectedException(String move_along) {
       super(move_along);
    }
    
}
