/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo;

/**
 *
 * @author S530719
 */
public class HourlyEmployee extends Employee{
    private int hoursWorked;
    private double wageRate;

    public HourlyEmployee(int id, String fName, String lName, int hours, double wageRate) {
        super(id, fName, lName);
        this.hoursWorked = hours;
        this.wageRate = wageRate;
    }

    @Override
    public double calcSalary() {
        return hoursWorked * wageRate;
    }

    @Override
    public double calcBenefits() {
       if(calcSalary() >= 10000){ return 0.1 * calcSalary();
       }
       
       return 0.0;
    }    
}
