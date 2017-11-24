/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.MPAA_Rating;

/**
 *
 * @author Vineeth Agarwal
 */
public class DVD extends Item {

    private MPAA_Rating rating;
    private double storageCapacity;
    private String dvdID;

    public DVD(MPAA_Rating rating, double storageCapacity, String title) {
        super(title);
        this.rating = rating;
        this.storageCapacity = storageCapacity;
        dvdID=generateUniqueID();
    }

    @Override
    public String generateRackID() {
        String rackId = "";

        for (int i = 0; i < (getTitle().length() / 3) * 3; i++) {
            String sub = getTitle().substring(i, i + 3);
            rackId += sub.substring(1) + sub.substring(0, 1);
            i = i + 2;
        }
        return rackId + "." + storageCapacity;
    }

    @Override
    public String generateUniqueID() {
        
        return  LIBRARY_CODE + "_DVD_" + counter;
    }

    public MPAA_Rating getRating() {
        return rating;
    }

    public void setRating(MPAA_Rating rating) {
        this.rating = rating;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", DVD ID: " + generateUniqueID() + ", Rating: "
                + rating + ", Storage Capacity: " + storageCapacity;
    }

}
