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
public class ChildInsurance extends AbstractInsurance {

    public ChildInsurance(String InsuranceCompanyName, double InsuranceCoverage, String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        super(InsuranceCompanyName, InsuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVisit);
    }

    @Override
    public double calcAmountPayableToHospital(double premiumPaidByCustomer,
            double billGenerated)
            throws NegativeAmountException {
        if (premiumPaidByCustomer < 0) {
            throw new NegativeAmountException();
        } else if (premiumPaidByCustomer > BASE_PREMIUM_AMOUNT) {
            return 0.8 * billGenerated;
        } else if (premiumPaidByCustomer <= BASE_PREMIUM_AMOUNT && premiumPaidByCustomer > BASE_PREMIUM_AMOUNT / 2) {
            return 0.5 * billGenerated;
        } else {
            return 0.2 * billGenerated;
        }
    }

    @Override
    public String toString() {
        return "Insurance Company Name: " + getInsuranceCompanyName() + ", Insurance Coverage: " + getInsuranceCoverage();
    }
}
