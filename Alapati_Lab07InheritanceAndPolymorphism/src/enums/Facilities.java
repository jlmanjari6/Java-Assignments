/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This is Facilities enumerator holding facility price for each constant.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16, 2017.
 */
public enum Facilities {
    CASINO(100), SPA(65), GYM(50), GAMES(80), BUFFETRESTAURANT(120), FOOD(20),
    UPPERDECK(20), DRINKS(10);

    private final double facilityPrice;

    /**
     * This is parameterized constructor.
     *
     * @param facilityPrice
     */
    private Facilities(double facilityPrice) {
        this.facilityPrice = facilityPrice;
    }

    /**
     * This is get method to return facility price.
     *
     * @return facilityPrice
     */
    public double getFacilityPrice() {
        return facilityPrice;
    }
}
