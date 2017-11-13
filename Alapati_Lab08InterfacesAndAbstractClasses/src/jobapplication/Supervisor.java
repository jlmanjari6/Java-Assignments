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
public class Supervisor extends Person{

    public Supervisor() {
    }

    public Supervisor(String firstName, String lastName, String phoneNumber, String emailID) {
        super(firstName, lastName, phoneNumber, emailID);
    }
    
    @Override
    public String getFullName(){
        return super.getFirstName() + " " + super.getLastName() + "( " + super.getFirstName().charAt(0) + "." + super.getLastName().charAt(0) + " )";
    }
    
    @Override
    public String toString(){
        return "Name of the supervisor: " + getFullName() + super.toString();
    }
}
