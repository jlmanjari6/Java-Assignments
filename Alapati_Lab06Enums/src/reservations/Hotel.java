/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This is Hotel enumerator contains the constants with values of the room cost.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public enum Hotel {
    SINGLE(150), DOUBLE(200), KING(300), QUEEN(250), NO(0);

    private final double roomCost;

    /**
     * This is parameterized constructor.
     *
     * @param roomCost
     */
    private Hotel(double roomCost) {
        this.roomCost = roomCost;
    }

    /**
     * This is get method to return Economy price
     *
     * @return economyPrice
     */
    public double getRoomCost() {
        return roomCost;
    }
}
