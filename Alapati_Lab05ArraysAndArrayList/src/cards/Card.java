/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * This is the Card class which provides the card type and card number
 * @author Lakshmi Manjari Alapati
 * @version Oct 2, 2017.
 */
public class Card {
    private int number;
    private String type;

    /**
     * This is constructor
     * @param number
     * @param type 
     */
    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    /**
     * This method returns card number
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * This method sets the card number
     * @param number 
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * This method returns card type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the card type
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This is toString method to display the card details.
     * @return card details
     */
    @Override
    public String toString() {
        return "Card{" + "number=" + number + '}';
    }
    
    
}
