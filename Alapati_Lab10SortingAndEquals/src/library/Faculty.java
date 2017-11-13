/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;

/**
 * Faculty represents the teaching staff of a university or college
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017.
 *
 */
public class Faculty extends Member {

    private String department;

    /**
     * Initializes the variables of this class and the super class.
     *
     * @param department
     * @param name
     * @param age
     */
    public Faculty(String department, String name, int age) {
        super(name, age);
        this.department = department;
        this.setItems(new Item[Limit.FACULTY.getItemLimit()]);
    }

    /**
     * Returns department of faculty
     *
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of faculty
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Invoke super.toString() and concatenate the department
     *
     * @return formattedDetails
     */
    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }

}
