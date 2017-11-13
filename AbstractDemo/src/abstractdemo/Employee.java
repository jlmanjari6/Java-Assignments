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
public abstract class Employee {
    private int id;
    private String fName;
    private String lName;

    public Employee(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + '}';
    }
    
    public abstract double calcSalary();
    
    public abstract double calcBenefits();
    
}
