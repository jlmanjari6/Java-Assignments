/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces;

import exceptions.MaximumLimitException;

/**
 * This is payable interface 
 * @author Lakshmi Manjari Alapati
 */
public interface Payable {
    
    /**
     * fee per course assigned to 800
     */
    double FEE_PER_COURSE = 800;
    
    /**
     * abstract method addCourses throws MaximumLimitException
     * @param courses
     * @throws MaximumLimitException 
     */
    void addCourses(String courses) throws MaximumLimitException;
    
    /**
     * abstract method calculateFee which takes no of courses as input
     * @param noOfCourses
     * @return 
     */
    double calculateFee(int noOfCourses);
}
