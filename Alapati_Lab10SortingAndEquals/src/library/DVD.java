package library;

import enums.MPAA_Rating;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * DVD represents a type of compact disc able to store large amounts of data,
 * especially high-resolution audiovisual material
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class DVD extends Item {

    private String dvdID;
    private MPAA_Rating rating;
    private double storageCapacity;

    /**
     * Initializes the variables of this class and the super class.
     *
     * @param rating
     * @param storageCapacity
     * @param title
     */
    public DVD(MPAA_Rating rating, double storageCapacity, String title) {
        super(title);
        this.dvdID = generateUniqueID();
        this.rating = rating;
        this.storageCapacity = storageCapacity;
    }

    /**
     * This method concatenates LIBRARY_CODE, "_DVD_", counter and returns it.
     *
     * @return uniqueId
     */
    @Override
    public java.lang.String generateUniqueID() {
        return LIBRARY_CODE + "_DVD_" + counter;
    }

    /**
     * This method generates rack identification number to keep the DVD at a
     * particular location in the library.
     *
     * @return rackId
     */
    @Override
    public String generateRackID() {
        String dvdTitle = super.getTitle();
        ArrayList<String> titleArray = new ArrayList<>();
        for (int i = 0; i < dvdTitle.length(); i++) {
            titleArray.add("" + dvdTitle.charAt(i));
        }
        for (int i = 0; i < titleArray.size(); i++) {
            if (!(titleArray.size() - i < 3)) {
                String ele = titleArray.get(i);
                titleArray.remove(i);
                titleArray.add(i + 2, ele);
                i = i + 2;
            }
        }
        dvdTitle = "";
        for (String s : titleArray) {
            dvdTitle += s.trim();
        }
        return dvdTitle + "." + storageCapacity;
    }

    /**
     * Returns MPAA rating of DVD
     *
     * @return rating
     */
    public MPAA_Rating getRating() {
        return rating;
    }

    /**
     * Sets MPAA rating of DVD
     *
     * @param rating
     */
    public void setRating(MPAA_Rating rating) {
        this.rating = rating;
    }

    /**
     * Returns the storage capacity of DVD
     *
     * @return storageCapacity
     */
    public double getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * Sets the storage capacity of DVD
     *
     * @param storageCapacity
     */
    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * Invoke super.toString() and concatenate dvdID, rating and storageCapacity
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + ", DVD ID: " + dvdID + ", Rating: " + rating + ", Storage Capacity: " + storageCapacity;
    }
}
