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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
AbstractBankAccount bankAcc = new CheckingAccount();
CashPayment c1 = new CashPayment();
CreditCardPayment c2 = new CreditCardPayment();
c1 = c2;
AbstractAccountPayment c3 = new CashPayment();
c3 = c2;
c2 = (CreditCardPayment)c3;















        
    }
    
}
