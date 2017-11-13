/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Applicant extends Person{
    int age;
    String educationQualification;
    int levelOfCommunication;
    boolean workExperience;

    public Applicant() {
    }

    public Applicant(boolean workExperience, String educationQualification, int levelOfCommunication, 
            int age, String firstName, String lastName, String phoneNumber, String emailID) {
        super(firstName, lastName, phoneNumber, emailID);
        this.age = age;
        this.educationQualification = educationQualification;
        this.levelOfCommunication = levelOfCommunication;
        this.workExperience = workExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public int getLevelOfCommunication() {
        return levelOfCommunication;
    }

    public void setLevelOfCommunication(int levelOfCommunication) {
        this.levelOfCommunication = levelOfCommunication;
    }

    public boolean isWorkExperience() {
        return workExperience;
    }
   
    public void setWorkExperience(boolean workExperience) {
        this.workExperience = workExperience;
    }
    
    @Override
    public String getFullName(){
        return super.getLastName() + ", " + super.getFirstName();
    }
    
    @Override
    public String toString(){
        return "Applicant Details\n" +
"Name of the applicant: " + getFullName() + super.toString() + "\nEducationQualification of the applicant: " + getEducationQualification();
    }
    
}
