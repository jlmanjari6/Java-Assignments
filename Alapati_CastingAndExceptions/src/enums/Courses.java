/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Create an enumerator named Courses and refer to the document for enumerator constants
 * @author Lakshmi Manjari Alapati
 */
public enum Courses {
    
    /**
     *
     */
    OOPS(44542,"Dr.Ajay Bandi"),

    /**
     *
     */
    WEBAPPS(44663,"Dr.Denise Case"),

    /**
     *
     */
    ADB(44144,"Dr.Doug Hawley"),

    /**
     *
     */
    HCI(44567,"Dr.Ankit Chowdary"),

    /**
     *
     */
    DA(44678,"Dr.Charles Hoot");
    
    /**
     * course Id
     */
    private int courseId;
    /**
     * name of the instructor teaching the course
     */
    private String instructor;

    /**
     * Create a two argument constructor by passing the courseId and instructor
     * @param courseId
     * @param instructor 
     */
    private Courses(int courseId, String instructor) {
        this.courseId = courseId;
        this.instructor = instructor;
    }

    /**
     * Get method should return courseId
     * @return courseId
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Get method should return instructor
     * @return instructor
     */
    public String getInstructor() {
        return instructor;
    }
    
    
}
