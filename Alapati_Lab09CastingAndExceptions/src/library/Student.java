/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;
import exceptions.InvalidNumberOfCourses;

/**
 *
 * @author Vineeth Agarwal
 */
public class Student extends Member {
    private String coursesTaken;
    public Student(String coursesTaken,String name, int age) {
        super(name, age);
        this.coursesTaken= coursesTaken;
        this.setItems(new Item[Limit.STUDENT.getItemLimit()]);
        
    }
    
    public boolean checkCoursesTaken() throws InvalidNumberOfCourses
    {
        String[] course=coursesTaken.split(",");
        if(course.length<=3){
        return true;
        }
        else{
        throw new InvalidNumberOfCourses();
        }
    }    

    @Override
    public String toString() {
        return super.toString()+"\nCourses Taken: " + coursesTaken;
    }
    
    
    
}
