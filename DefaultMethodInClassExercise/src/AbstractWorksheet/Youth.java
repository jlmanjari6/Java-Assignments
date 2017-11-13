/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractWorksheet;

/**
 *
 * @author S530719
 */
public class Youth extends Exhibitor {

    private static final int PTS_NEEDED = 250;
    private static final int NUMBER_OF_EVENTS = 2;
    private int numEvents;

    public Youth() {
    }

    public Youth(String lastName, String firstName, int yearOfBirth, int points, int numEvents) {
        super(lastName, firstName, yearOfBirth, points);
        this.numEvents = numEvents;
    }
    
    @Override
    public boolean worldShowQualified(){
        return super.getPoints() > PTS_NEEDED && this.numEvents > NUMBER_OF_EVENTS;
    }

    @Override
    public String toString() {
        return super.toString() + " " + numEvents;
    }
    
    
    

    
}
