/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 * This class provides methods for adding and removing the cards from respective
 * array list.It also displays the cards present in each array list.
 * @author Lakshmi Manjari Alapati
 */
public class CardsArrayList {

    private ArrayList<Card> clubs;
    private ArrayList<Card> diamonds;
    private ArrayList<Card> hearts;
    private ArrayList<Card> spades;

    /**
     * This is constructor initializing the array lists.
     */
    public CardsArrayList() {
        clubs = new ArrayList<>();
        diamonds = new ArrayList<>();
        hearts = new ArrayList<>();
        spades = new ArrayList<>();
    }

    /**
     * This method returns the clubs 
     * @return clubs
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

      /**
     * This method returns the diamonds 
     * @return diamonds
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

     /**
     * This method returns the hearts 
     * @return hearts
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

     /**
     * This method returns the spades 
     * @return spades
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }

    /**
     * This method will take the cards object as a parameter. Using this object,
     * you can find the type of card and use it in a switch statement. 
     * Based on the type of card like “clubs”, “diamonds”, “hearts” or “spade”, 
     * add the cards to their respective ArrayList. Return the message as 
     * respective “card added successfully” for every successful addition
     * @param c
     * @return success message on each addition.
     */
    public String addCardsToList(Card c) {
        switch (c.getType()) {
            case "clubs":
                clubs.add(c);
                return c.getType() + " card added successfully";
            case "diamonds":
                diamonds.add(c);
                return c.getType() + " card added successfully";
            case "hearts":
                hearts.add(c);
                return c.getType() + " card added successfully";
            case "spades":
                spades.add(c);
                return c.getType() + " card added successfully";
            default:
                return "";
        }
    }

    /**
     * It takes in the position at which the element needs to be removed. 
     * It also takes in the ArrayList of cards as input parameters from which
     * card needs to be removed. The goal of this method is to remove elements 
     * from array list at a specified position. If the position passed is less 
     * than zero or if the position is greater or equal to the size of the 
     * ArrayList passed then it must return a message as “ArrayList size
     * underflow, card cannot be removed”. Else this method must remove the
     * element from the array list and return a message as “Card is removed successfully!”
     * @param position
     * @param c
     * @return message whether or not card can be removed.
     */
    public String removeCardsFromList(int position, ArrayList<Card> c) {
        if (position < 0 || position >= c.size()) {
            return "ArrayList size underflow, card cannot be removed";
        }
        c.remove(position);
        return "Card is removed successfully!";
    }

     /**
     * This is toString method to display the cards present in corresponding
     * array list in the required format.
     * @return cards in each array list.
     */
    @Override
    public String toString() {
        String result = "Hearts ArrayList: [";
        for (Card h : hearts) {
            result += h.getNumber() + " ";
        }
        result += "]";

        result += "\nDiamonds ArrayList: [";
        for (Card d : diamonds) {
            result += d.getNumber() + " ";
        }
        result += "]";

        result += "\nSpades ArrayList: [";
        for (Card s : spades) {
            result += s.getNumber() + " ";
        }
        result += "]";

        result += "\nClubs ArrayList: [";
        for (Card c : clubs) {
            result += c.getNumber() + " ";
        }
        result += "]";

        return result;
    }
}
