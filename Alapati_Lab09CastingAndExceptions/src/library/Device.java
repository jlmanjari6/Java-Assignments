/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import java.util.Date;

/**
 *
 * @author Vineeth Agarwal
 */
public class Device extends Item {

    private String deviceID;
    private String rackNo;

    public Device(String title) {
        super(title);
    }


    @Override
    public double calculateFine(String dateTime1, String dateTime2)
            throws NoFineException {

        Date returnDate = new Date(dateTime2);
        Date dueDate = new Date(dateTime1);
        int dateDiff = (returnDate.compareTo(dueDate));

        if (dateDiff < 0) {
            throw new NoFineException("Return date is before due date");
        } else {
            if (dateDiff < 1) {
                return 0;
            } else if (dateDiff >= 1 || dateDiff <= 5) {
                return 5;
            } else if (dateDiff > 5 || dateDiff <= 10) {
                return 10;
            } else {
                return 50;
            }

        }
    }


    @Override
    public String generateRackID() {
       
            if(getTitle().substring(0,1).equals("I"))
            {
              if(getTitle().substring(1,2).equals("p"))
              {
              rackNo=getTitle()+"_D_"+getTitle().length();
              }
              else{              
                  rackNo=getTitle().substring(0,1)+getTitle().substring(2)+
                          "_D_"+getTitle().length();}
            }
            else if  (getTitle().substring(1,2).equals("p"))
                {
                 rackNo=getTitle().substring(1)+
                       "_D_"+getTitle().length();
                    }
            else{
                  rackNo=getTitle().substring(2)+
                       "_D_"+getTitle().length();
            
            }
                return rackNo;
    }

    @Override
    public String generateUniqueID() {
        deviceID=LIBRARY_CODE+"_D_"+counter;
        return deviceID;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", DeviceID: " + generateUniqueID()
                + ", RackNo: " + generateRackID();
    }

}
