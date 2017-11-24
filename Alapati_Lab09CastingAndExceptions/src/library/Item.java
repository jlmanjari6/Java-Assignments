/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import interfaces.Library;
import java.util.Date;

/**
 *
 * @author Vineeth Agarwal
 */
public abstract class Item implements Library{
private boolean available;
public static int counter=0;
private String title;

    public Item(String title) {
        this.title = title;
        counter++;          
    }
    public double calculateFine(String dateTime1,String dateTime2 ) throws NoFineException
    {
        Date returnDate = new Date(dateTime2);
        Date dueDate = new Date(dateTime1);
        int dateDiff = (returnDate.compareTo(dueDate));

        if (dateDiff < 0) {
            throw new NoFineException("Return date is before due date");
        } else {
            if (dateDiff==0) {
                return 0;
            } else if (dateDiff >= 1 || dateDiff <= 7) {
                return 5;
            } else if (dateDiff > 7 || dateDiff <= 14) {
                return 10;
            } else if (dateDiff > 14 || dateDiff <= 28) {
                return 20;              
            } else {
                return 100;
            }
        }
    }
    public abstract String generateRackID();
    public abstract String generateUniqueID();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title +", Available: " + available ;
    }
    
           

}
