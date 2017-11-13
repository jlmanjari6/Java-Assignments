/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

/**
 *
 * @author S530719
 */
public class Course {
    private int courseNo;
    private String courseName;
    private double courseFee;

    public Course(int courseNo, String courseName, double courseFee) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
       /* return "Course{" + "courseNo=" + courseNo + ", courseName=" + courseName + ", courseFee=" 
                + courseFee + '}'; */
       return String.format("%04d, %15s, %4.7f", courseNo, courseName, courseFee);
    }
    
    
}
