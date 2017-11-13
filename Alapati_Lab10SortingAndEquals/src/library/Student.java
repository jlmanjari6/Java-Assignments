/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;
import exceptions.InvalidNumberOfCourses;

/**
 * A person who is studying at a school or college.
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class Student extends Member {

    private String coursesTaken;

    /**
     * Initializes the variables of this class and the super class.
     *
     * @param coursesTaken
     * @param age
     * @param name
     */
    public Student(String coursesTaken, int age, String name) {
        super(name, age);
        this.coursesTaken = coursesTaken;
        this.setItems(new Item[Limit.STUDENT.getItemLimit()]);
    }

    /**
     * This method returns true if the number of courses taken by a student is
     * less than or equal to 3.
     *
     * @return boolean
     * @throws InvalidNumberOfCourses
     */
    public boolean checkCoursesTaken()
            throws InvalidNumberOfCourses {
        if (Integer.parseInt(coursesTaken) <= 3) {
            return true;
        } else {
            throw new InvalidNumberOfCourses();
        }
    }

    /**
     * Invoke super.toString() and concatenate the coursesTaken
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        return super.toString() + "\nCourses Taken: " + coursesTaken + "\n";
    }

}
