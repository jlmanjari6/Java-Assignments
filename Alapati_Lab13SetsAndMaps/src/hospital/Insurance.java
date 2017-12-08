/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public interface Insurance {
    static final double BASE_PREMIUM_AMOUNT = 600.00;
    
    java.lang.String checkHealthInsurancePlan()
                                   throws InvalidInsuranceIDException;
    double calcAmountPayableToHospital(double PremiumPaid,
                                   double billGenerated)
                            throws NegativeAmountException;
}
