/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import intefaces.Payable;

/**
 * This abstract class implements the Payable interface and contains the details of the student.
 * @author Lakshmi Manjari Alapati
 */
public abstract class Student implements Payable {
    
    /**
     * first name of the student
     */
    private String fName;
     /**
      * Access field {@link Student#fName}
     * last name of the student
     */
    private String lName;
     /**
     * sId of the student
     */
    private String sId;

    /**
     * Create a three argument constructor by passing the first name, last name and sId
     * @param fName
     * @param lName
     * @param sId 
     */
    public Student(String fName, String lName, String sId) {
        this.fName = fName;
        this.lName = lName;
        this.sId = sId;
    }

    /**
     * Get method should return first Name
     * @return fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * Set method should assign the value of the parameter to fName
     * @param fName 
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Get method should return last Name
     * @return lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * Set method should assign the value of the parameter to lName
     * @param lName 
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Get method should return student id
     * @return sId
     */
    public String getsId() {
        return sId;
    }

    /**
     * Set method should assign the value of the parameter to sId
     * @param sId 
     */
    public void setsId(String sId) {
        this.sId = sId;
    }

    /**
     * This method should print the details in the specified format.
     * @return Student{" + "fName=" + fName + ", lName=" + lName + ", sId=" + sId + '}'
     */
    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + ", sId=" + sId + '}';
    }
    
    /**
     * This is the abstract method which will be later implemented by the sub classes.
     * @param noOfCourses
     * @return 
     */
    @Override
    public abstract double calculateFee(int noOfCourses);    
    
}
