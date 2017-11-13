/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This is Airline enumerator contains the constants with values of the economy
 * class price, business class price and discount.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public enum Airline {

    DELTA(750, 1500, 10), US_AIRWAYS(570, 1400, 11), UNITED(700, 1450, 9), CATHAY_PACIFIC(710, 1480, 8), AIR_CANADA(640, 1590, 10),
    AMERICAN_AIRLINES(560, 1200, 6), AIR_FRANCE(450, 1100, 5), AIR_INDIA(590, 1080, 9), JETBLUE(430, 890, 5), QANTAS(670, 1200, 9);

    private final double economyPrice;
    private final double businessPrice;
    private final double discount;

    /**
     * This is get method to return Economy price
     *
     * @return economyPrice
     */
    public double getEconomyPrice() {
        return economyPrice;
    }

    /**
     * This is get method to return Business price
     *
     * @return businessPrice
     */
    public double getBusinessPrice() {
        return businessPrice;
    }

    /**
     * This is get method to return discount
     *
     * @return discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * This is parameterized constructor.
     *
     * @param economyPrice
     * @param businessPrice
     * @param discount
     */
    private Airline(double economyPrice, double businessPrice, double discount) {
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.discount = discount;
    }

}
