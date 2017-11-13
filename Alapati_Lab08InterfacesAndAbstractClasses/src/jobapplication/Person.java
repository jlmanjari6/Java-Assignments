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
public abstract class Person {

    String emailID;
    String firstName;
    String lastName;
    String phoneNumber;

    public Person() {

    }

    public Person(String firstName, String lastName, String phoneNumber, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber(String phoneNumber) {
        return "+1(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
    }

    public abstract String getFullName();

    @Override
    public String toString() {
        return "\nContact Details: " + getEmailID() + ", " + getFormattedPhoneNumber(phoneNumber);
    }
}
