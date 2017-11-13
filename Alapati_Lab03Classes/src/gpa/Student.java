/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private double studentGrade1;
    private double studentGrade2;
    private double studentGrade3;     
    
    /**
     * default constructor
     */
    public Student()
    {
        
    }

    /**
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 
     * @param studentId 
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 
     * @return studentGrade1
     */
    public double getStudentGrade1() {
        return studentGrade1;
    }

    /**
     * 
     * @param studentGrade1 
     */
    public void setStudentGrade1(double studentGrade1) {
        this.studentGrade1 = studentGrade1;
    }

    /**
     * 
     * @return studentGrade2
     */
    public double getStudentGrade2() {
        return studentGrade2;
    }

    /**
     * 
     * @param studentGrade2 
     */
    public void setStudentGrade2(double studentGrade2) {
        this.studentGrade2 = studentGrade2;
    }

    /**
     * 
     * @return studentGrade3
     */
    public double getStudentGrade3() {
        return studentGrade3;
    }

    /**
     * 
     * @param studentGrade3 
     */
    public void setStudentGrade3(double studentGrade3) {
        this.studentGrade3 = studentGrade3;
    }
    
    /**
     * 
     * @param firstName
     * @param lastName
     * @param studentId
     * @param grade1
     * @param grade2
     * @param grade3 
     */
    public Student(String firstName, String lastName, String studentId, double grade1, double grade2
            , double grade3)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.studentGrade1 = grade1;
        this.studentGrade2 = grade2;
        this.studentGrade3 = grade3;                
    }
    
    /**
     * 
     * @return toString final output
     */
    @Override
    public String toString() {
        return "Student:\n" + "First Name = " + getFirstName() + "\nLast Name = " + getLastName()
                + "\nStudent Id = " + getStudentId() + "\nGrade 1 = " + getStudentGrade1()
                + "\nGrade2 = " + getStudentGrade2() + "\nGrade3 = " + getStudentGrade3();
    }
    
    /**
     * 
     * @param grade1
     * @param grade2
     * @param grade3
     * @return 
     */
    public double calculateGPA(double grade1, double grade2, double grade3){
        double gpa;
        int creditHours = 3;
        gpa = creditHours* (grade1 + grade2 + grade3)/9;
        return gpa;
    }
    
    /**
     * 
     * @param grade
     * @return grade point
     */
    public double pointsGraded(String grade)
    {
        switch(grade.trim().toUpperCase())
        {
            case "A": return 5.0;
            case "B": return 4.0;
            case "C": return 3.0;
            case "D": return 2.0;
            case "E": return 1.0;
            case "F": return 0.0;
            default: return -1;
        }
    }
}
