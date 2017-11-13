/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * Author represents a writer of a book
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class Author {

    private String firstName;
    private String lastName;
    private String middleName;

    /**
     * Initializes the variables of Author
     *
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    /**
     * Initializes the variables of Author
     *
     * @param firstName
     * @param lastName
     */
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the Author
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the Author
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the Author
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the Author
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the middle name of the Author
     *
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name of the Author
     *
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Returns private instance variables in given format.
     *
     * @return formattedName
     */
    @Override
    public String toString() {
        if (middleName != null) {
            return lastName + ", " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".";
        }
        return lastName + ", " + firstName.charAt(0) + ".";
    }

}
