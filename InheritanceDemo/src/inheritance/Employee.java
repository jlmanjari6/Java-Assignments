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
public class Employee implements NewInterface {
    private String firstName;
    private String lastName;
    private int empId;
    private int ssn;

    public Employee(String firstName, String lastName, int empId, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    
    @Override
    public String toString(){
        return ssn + getFullName();
    }
    
    public double calcSalary(){
        return 10000.00;
    }
    
    public String getFullName(){
        return lastName + ", "  + firstName;
        }
    
    @Override
    public int add(int a,int b){
        return 10;
    }
}
