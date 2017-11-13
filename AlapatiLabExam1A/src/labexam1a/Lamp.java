/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam1a;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Lamp {
    private int hoursOn ;
    private boolean powered;
    private String location;

    public Lamp(String location) {
        this.location = location;
        hoursOn = 0;
        powered = false;
    }

    public Lamp(int hoursOn, boolean powered, String location) {
        this.hoursOn = hoursOn;
        this.powered = powered;
        this.location = location;
    }

    public int getHoursOn() {
        return hoursOn;
    }

    public boolean isPowered() {
        return powered;
    }

    public String getLocation() {
        return location;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    @Override
    public String toString() {
        return "Lamp{" + "hoursOn=" + hoursOn + ", powered=" + powered + ", location=" + location + '}';
    }
    
    public void increaseHoursOn(int amount) {
        if(amount > 0){
            hoursOn += amount;
        }
    }
    
    public double computePowerUsed(double watts){
        return hoursOn * watts;
    }
    
    public String middlePartOfLocation() {
        int spaceCount = 0;
        for(int i=0; i< location.length();i++){
            if(location.charAt(i) == ' '){
                spaceCount++;
            }
        }
        
        if(spaceCount <= 1){
            return null;
        }
        return location.substring(location.trim().indexOf(" ")+ 1, location.lastIndexOf(" "));
    }
    
    
    
    
}
