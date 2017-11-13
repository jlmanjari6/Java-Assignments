/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 * Faculty List represents a Collected set of faculties
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class FacultyList {

    private ArrayList<Faculty> facultyList;
    private ArrayList<java.lang.String> listOfNames;

    public FacultyList() {
        facultyList = new ArrayList<>();
        listOfNames = new ArrayList<>();
    }

    /**
     * Method that adds faculty to the facultyList
     *
     * @param faculty
     */
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    /**
     * Returns the faculty list
     *
     * @return facultyList
     */
    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    /**
     * Overridden equals method.
     *
     * @param other
     * @return compare
     */
    @Override
    public boolean equals(Object other) {
        return listOfNames.equals(other);
    }

    /**
     * Method adds names to the listOfNames
     *
     * @param name
     */
    public void addFacultyNames(String name) {
        listOfNames.add(name);
    }

    /**
     * Prints the array list facultyLis
     *
     * @return formattedList
     */
    @Override
    public String toString() {
        String result = "";
        for (Faculty f : facultyList) {
            result += f.toString();
        }
        return result;
    }
}
