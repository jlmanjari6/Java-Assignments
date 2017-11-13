/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import interfaces.Library;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Item represents a Book, DVD or Device
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public abstract class Item implements Library {

    private boolean available;
    public static int counter = 0;
    private String title;

    /**
     * Initializes the title and increments the counter by 1
     *
     * @param title
     */
    public Item(String title) {
        this.title = title;
        counter++;
    }

    /**
     * Returns the availability status of an item
     *
     * @return available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Returns the title of an item
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the availability status of an item
     *
     * @param available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Sets the title of an item
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * An abstract method to generate unique ID for an item
     *
     * @return uniqueId
     */
    public abstract String generateUniqueID();

    /**
     * An abstract method to generate rack ID for an item
     *
     * @return rackId
     */
    public abstract String generateRackID();

    /**
     * Calculates the fine a member needs to pay to the library in dollars.
     *
     * @param dateTime1
     * @param dateTime2
     * @return fine
     * @throws NoFineException
     */
    @Override
    public double calculateFine(java.lang.String dateTime1,
            java.lang.String dateTime2)
            throws NoFineException {
        int fine = 0;
        try {
            SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date1 = myFormat.parse(dateTime1);
            Date date2 = myFormat.parse(dateTime2);
            long dateDiff = (-date1.getTime() + date2.getTime()) / (3600 * 1000 * 24);
            if (dateDiff < 0) {
                throw new NoFineException("Return date is before due date");
            } else {
                if (dateDiff < 1) {
                    fine = 0;
                } else if (dateDiff >= 1 && dateDiff <= 5) {
                    fine = 5;
                } else if (dateDiff > 5 && dateDiff <= 10) {
                    fine = 10;
                } else {
                    fine = 50;
                }

            }
        } catch (ParseException ex) {
            Logger.getLogger(Device.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fine;
    }

    /**
     * String representation of Item in given format.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Available: " + available;
    }

}
