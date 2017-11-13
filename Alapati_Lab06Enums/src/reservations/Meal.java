/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This is Meal enumerator contains the constants with values of the Meal Price.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public enum Meal {
    VEG(10), NON_VEG(11), HINDU_MEAL(13), NO(0);

    private final double mealPrice;

    /**
     * This is parameterized constructor.
     *
     * @param mealPrice
     */
    private Meal(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    /**
     * This is get method to return meal price
     *
     * @return meal price
     */
    public double getMealPrice() {
        return mealPrice;
    }
}
