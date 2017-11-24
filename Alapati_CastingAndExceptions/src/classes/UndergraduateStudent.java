/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.MaximumLimitException;
import static intefaces.Payable.FEE_PER_COURSE;
import java.util.ArrayList;

/**
 * This class extends the Student class and implements the abstract methods
 * @author Lakshmi Manjari Alapati
 */
public class UndergraduateStudent extends Student {

    /**
     * total fee
     */
    private double totalFee;
    /**
     * courses list
     */
    private ArrayList<String> coursesList;
    /**
     * no of Prerequisites
     */
    private int noOfPrerequisities;

    /**
     * Create a three argument constructor by passing the first name, last name and sId
     * @param noOfPrerequisities
     * @param fName
     * @param lName
     * @param sId 
     */
    public UndergraduateStudent(int noOfPrerequisities, String fName, String lName, String sId) {
        super(fName, lName, sId);
        this.coursesList = new ArrayList<>();
        this.noOfPrerequisities = noOfPrerequisities;
    }

    /**
     * Get method returns total fee
     * @return totalFee
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * Set method assigns total fee to totalFee
     * @param totalFee 
     */
    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * This is the implementation of Abstract method in Student class which takes no of courses as parameter and calculates the total fee by multiplying the 
     * no of courses with fee per course
     * @param noOfCourses
     * @return totalFee
     */
    @Override
    public double calculateFee(int noOfCourses) {
        return noOfCourses * FEE_PER_COURSE;
    }

    /**
     * Get method returns the total number of courses
     * @return coursesList
     */
    public ArrayList<String> getCoursesList() {
        return coursesList;
    }

    /**
     * Set method assigns the courses list to coursesList
     * @param coursesList 
     */
    public void setCoursesList(ArrayList<String> coursesList) {
        this.coursesList = coursesList;
    }

    /**
     * Get method returns the number of per requisites
     * @return no of prerequisites
     */
    public int getNoOfPrerequisities() {
        return noOfPrerequisities;
    }

    /**
     * Set method assigns the number of per requisites.
     * @param noOfPrerequisities
     */    
    public void setNoOfPrerequisities(int noOfPrerequisities) {
        this.noOfPrerequisities = noOfPrerequisities;
    }


    /**
     * This is the implementation for abstract method add courses in Student
     * class which takes courses separated by commas and adds to the
     * coursesList. WHen the sum of input count and the no of prerequisites
     * entered is greater than 3, maximum limit exception is to be thrown with
     * the message * "Maximum limit reached. Please enter only 3 courses!"
     *
     * @param courses
     * @throws MaximumLimitException
     */
    @Override
    public void addCourses(String courses) throws MaximumLimitException {
        String[] arrayCourse = courses.split(",");
        for (String course : arrayCourse) {
            if (courses.length() + noOfPrerequisities > 3) {
                throw new MaximumLimitException("Maximum limit reached. Please enter only 3 courses!");
            }
            coursesList.add(course);
        }
    }

    /**
     * This method should print the details in the specified format. 
     *
     * @return "UndergraduateStudent{" + "totalFee=" + totalFee + ", coursesList=" + coursesList + ", noOfPrerequisities=" + noOfPrerequisities + '}'
     */
    @Override
    public String toString() {
        return "UndergraduateStudent{" + "totalFee=" + totalFee + ", coursesList=" + coursesList + ", noOfPrerequisities=" + noOfPrerequisities + '}';
    }

}
