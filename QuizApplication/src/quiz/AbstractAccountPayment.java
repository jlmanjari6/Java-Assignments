/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author S530719
 */
public class AbstractAccountPayment implements Payment {

    @Override
    public double paymentDue() {
       return 13.0;
    }
    
    
    
}
