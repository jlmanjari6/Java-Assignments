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
public class CheckingAccount extends AbstractBankAccount  {
    public String getInfo(){
        return "getInfo";
    }
    
   
    public String accountDetails(){
        return "accountDetails";
    }

    @Override
    public double calculateInterest() {
      return 10.0;
    }

   
    public double paymentDue() {
       return 12.0;
    }
}
