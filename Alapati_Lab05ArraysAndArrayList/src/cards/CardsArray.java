/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * This is the CardsArray class which has methods for adding cards
 * to an array and to remove cards from an array.
 * @author Lakshmi Manjari Alapati
 * @version Oct 2, 2017.
 */
public class CardsArray {

    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;

    public static final int DECK_SIZE = 5;

    private int clubsCount;
    private int diamondsCount;
    private int heartsCount;
    private int spadesCount;

    /**
     * This is constructor initializing the card arrays and count variables.
     */
    public CardsArray() {
        clubs = new Card[DECK_SIZE];
        diamonds = new Card[DECK_SIZE];
        hearts = new Card[DECK_SIZE];
        spades = new Card[DECK_SIZE];

        clubsCount = 0;
        diamondsCount = 0;
        heartsCount = 0;
        spadesCount = 0;
    }

    /**
     * This method returns the clubs count
     * @return clubsCount
     */
    public int getClubsCount() {
        return clubsCount;
    }

    /**
     * This method returns the diamonds count
     * @return diamondsCount
     */
    public int getDiamondsCount() {
        return diamondsCount;
    }

    /**
     * This method returns the hearts count
     * @return heartsCount
     */
    public int getHeartsCount() {
        return heartsCount;
    }
    
    /**
     * This method returns the spades count
     * @return spadesCount
     */
    public int getSpadesCount() {
        return spadesCount;
    }

    /**
     * This method adds the given card to corresponding array.Based on the type
     * of card like “clubs”, “diamonds”, “hearts” or “spade”, add the card to
     * the respective array at the end. However, you will need to check if the
     * card count is not crossing the DECK_SIZE. Moreover, increment the count
     * by one on each successful addition. If DECK_SIZE is less than or equal
     * to the card count then remove the card at 0th position from the 
     * respective array and add the new card at the end of array. 
     * @param c 
     */
    public void addCardsToArray(Card c) {
        switch (c.getType()) {
            case "hearts":
                if (heartsCount < DECK_SIZE) {
                    hearts[heartsCount] = c;
                    heartsCount++;
                } else {
                    removeCardsFromArray(0, c.getType());
                    addCardsToArray(c);
                }
                break;
            case "diamonds":
                if (diamondsCount < DECK_SIZE) {
                    diamonds[diamondsCount] = c;
                    diamondsCount++;
                } else {
                    removeCardsFromArray(0, c.getType());
                    addCardsToArray(c);
                }
                break;
            case "clubs":
                if (clubsCount < DECK_SIZE) {
                    clubs[clubsCount] = c;
                    clubsCount++;
                } else {
                    removeCardsFromArray(0, c.getType());
                    addCardsToArray(c);
                }
                break;
            case "spades":
                if (spadesCount < DECK_SIZE) {
                    spades[spadesCount] = c;
                    spadesCount++;
                } else {
                    removeCardsFromArray(0, c.getType());
                    addCardsToArray(c);
                }
                break;
        }
    }

    /**
     * This method takes position and cardType as parameters. Use if-else
     * statement to remove elements from “clubs”, “diamonds”, “spades”, and
     * “hearts” type arrays at specified position based on the card type.
     * If the position is less than the card count or position is equal or 
     * greater than zero then it must remove the card from the specified 
     * position and other elements are shifted to fill the empty space. 
     * Also decrease the count by one on each successful removal.
     * @param position
     * @param cardType 
     */
    public void removeCardsFromArray(int position, String cardType) {
        if (cardType.equals("hearts")) {
            if (position < heartsCount || position >= 0) {
                hearts[position] = null;
                for (int i = position; i < heartsCount; i++) {
                    hearts[i] = (i + 1 != heartsCount) ? hearts[i + 1] : null;
                }
                heartsCount--;
            }
        }
        if (cardType.equals("diamonds")) {
            if (position < diamondsCount || position >= 0) {
                diamonds[position] = null;
                for (int i = position; i < diamondsCount; i++) {
                    diamonds[i] = (i + 1 != diamondsCount) ? diamonds[i + 1] : null;
                }
                diamondsCount--;
            }
        }
        if (cardType.equals("spades")) {
            if (position < spadesCount || position >= 0) {
                spades[position] = null;
                for (int i = position; i < spadesCount; i++) {
                    spades[i] = (i + 1 != spadesCount) ? spades[i + 1] : null;
                }
                spadesCount--;
            }
        }
        if (cardType.equals("clubs")) {
            if (position < clubsCount || position >= 0) {
                clubs[position] = null;
                for (int i = position; i < clubsCount; i++) {
                    clubs[i] = (i + 1 != clubsCount) ? clubs[i + 1] : null;
                }
                clubsCount--;
            }
        }
    }

    /**
     * This is toString method to display the cards present in corresponding
     * array in the required format.
     * @return cards in each array.
     */
    @Override
    public String toString() {

        String result = "Hearts Array: [";
        if (heartsCount != 0) {
            for (Card h : hearts) {
                if (h != null) {
                    result += h.getNumber() + " ";
                }
            }
            result += "]";
        }

        result += "\nDiamonds Array: [";
        if (diamondsCount != 0) {
            for (Card d : diamonds) {
                if (d != null) {
                    result += d.getNumber() + " ";
                }
            }
            result += "]";
        }

        result += "\nSpades Array: [";
        if (spadesCount != 0) {
            for (Card s : spades) {
                if (s != null) {
                    result += s.getNumber() + " ";
                }
            }
            result += "]";
        }

        result += "\nClubs Array: [";
        if (clubsCount != 0) {
            for (Card c : clubs) {
                if (c != null) {
                    result += c.getNumber() + " ";
                }
            }
            result += "]";
        }
        return result;
    }
}
