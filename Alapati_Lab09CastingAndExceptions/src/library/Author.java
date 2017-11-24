/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Vineeth Agarwal
 */
public class Author {
   private String firstName;
   private String middleName;
   private String lastName;

    public Author(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
               
        return  lastName + ", "+firstName.substring(0,1)+
        "."+(middleName!=null?" "+middleName.substring(0,1)+".":"");
        

    }
    
    
}
