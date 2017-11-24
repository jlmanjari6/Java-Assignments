/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.MaximumLimitException;
import java.util.ArrayList;

/**
 * This class extends the Student class and implements the abstract methods
 * @author Lakshmi Manjari Alapati
 */
public class GraduateStudent extends Student{
    /**
     * total fee
     */
    private double totalFee;
    /**
     * list of courses
     */
    private ArrayList<String> coursesList;

    /**
     * Create a three argument constructor by passing the first name, last name and sId
     * @param fName
     * @param lName
     * @param sId 
     */
    public GraduateStudent(String fName, String lName, String sId) {
        super(fName, lName, sId);
        coursesList = new ArrayList<>();
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
     * @return 
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
     * This is the implementation for abstract method add courses in Student class which takes courses separated by commas
     * and adds to the coursesList. WHen the input count is greater than 3, maximum limit exception is to be thrown with the message 
     * "Maximum limit reached. Please enter only 3 courses!"
     * @param courses
     * @throws MaximumLimitException 
     */
    @Override
    public void addCourses(String courses) throws MaximumLimitException{
        String[] arrayCourse = courses.split(",");
        for(String course : arrayCourse){
            if(courses.length() > 3){
                throw new MaximumLimitException("Maximum limit reached. Please enter only 3 courses!");
            }
            coursesList.add(course);
        }
    }

    /**
     * This method should print the details in the specified format.
     * @return "GraduateStudent{" + "totalFee=" + totalFee + ", coursesList=" + coursesList + '}'
     */
    @Override
    public String toString() {
        return "GraduateStudent{" + "totalFee=" + totalFee + ", coursesList=" + coursesList + '}';
    }
    
    
    
    
}
