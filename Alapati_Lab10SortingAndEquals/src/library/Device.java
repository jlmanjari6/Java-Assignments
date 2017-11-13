/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Device represents a piece of mechanical or electronic equipment
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class Device extends Item {

    private String deviceID;
    private String rackNo;

    /**
     * Initialize the variables of super class.
     *
     * @param title
     */
    public Device(String title) {
        super(title);
        rackNo = generateRackID();
        deviceID = generateUniqueID();
    }

    /**
     * Calculates the fine a member needs to pay to the library in dollars.
     *
     * @param dateTime1
     * @param dateTime2
     * @return
     * @throws NoFineException
     */
    @Override
    public double calculateFine(String dateTime1, String dateTime2)
            throws NoFineException {
        int fine = 0;
        try {
            SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date1 = myFormat.parse(dateTime1);
            Date date2 = myFormat.parse(dateTime2);
            long dateDiff = (-date1.getTime() + date2.getTime()) / (3600 * 1000);
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
     * This method concatenates LIBRARY_CODE, "_D_", counter and returns it.
     *
     * @return uniqueId
     */
    @Override
    public String generateUniqueID() {
        return LIBRARY_CODE + "_D_" + counter;
    }

    /**
     * This method generates rack identification number to keep the device at a
     * particular location in the library .
     *
     * @return rackId
     */
    @Override
    public String generateRackID() {
        String rackId = super.getTitle().substring(2) + "_D_" + this.generateUniqueID().length();
        if (super.getTitle().charAt(0) != 'I' && super.getTitle().charAt(1) != 'p') {
            return rackId;
        }
        if (super.getTitle().charAt(1) == 'p') {
            rackId = 'p' + rackId;
        }
        if (super.getTitle().charAt(0) == 'I') {
            rackId = 'I' + rackId;
        }
        return rackId;
    }

    /**
     * Invoke super.toString() and concatenate deviceID and rackNo.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        return super.toString() + ", DeviceID: " + deviceID + ", RackNo: " + rackNo;

    }
}
