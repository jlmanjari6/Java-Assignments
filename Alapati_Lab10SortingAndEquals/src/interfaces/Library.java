/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exceptions.NoFineException;

/**
 * Library represents a building or room containing collections of books,
 * periodicals, and sometimes films and recorded music for people to read,
 * borrow, or refer to.
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public interface Library {

    static final String LIBRARY_CODE = "NWM";

    double calculateFine(String dateTime1, String dateTime2) throws NoFineException;
}
