/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author S530719
 */
public class HourlyEmployee extends Employee {

    private int noOfHours;
    private double hourlyPay;

    public HourlyEmployee(String firstName, String lastName, int empId, int ssn, int noOfHours, double hourlyPay) {
        super(firstName, lastName, empId, ssn);
        this.hourlyPay = hourlyPay;
        this.noOfHours = noOfHours;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {
        return super.toString() + " " + noOfHours + " " + hourlyPay;
    }

    @Override
    public double calcSalary() {
        return noOfHours * hourlyPay;
    }

    public int calcInsurance() {
        return 50;
    }

    @Override
    public String getFullName() {
        return super.getFullName() + " " + super.getFirstName() + " " + super.getLastName(); //To change body of generated methods, choose Tools | Templates.
    }

}
