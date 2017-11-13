/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.ArrayList;

/**
 * This is Passenger Ship class being inherited by Cruise and Ferry classes.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class PassengerShip extends Ship {

    private double basePrice;
    private ArrayList<String> facilities;

    /**
     * This is parameterized constructor.
     *
     * @param manufacturerName
     * @param modelSeries
     * @param shipName
     * @param sourceLocation
     * @param destinationLocation
     * @param model
     * @param basePrice
     */
    public PassengerShip(String manufacturerName, int modelSeries, String shipName,
            Point sourceLocation, Point destinationLocation, String model,
            double basePrice) {
        super(manufacturerName, modelSeries, shipName, sourceLocation,
                destinationLocation, model);
        this.basePrice = basePrice;
        this.facilities = new ArrayList<>();
    }

    /**
     * This is no-argument constructor.
     */
    public PassengerShip() {

    }

    /**
     * This is get method to return base price.
     *
     * @return basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * This method sets the value for base price
     *
     * @param basePrice
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * This is get method to return facilities
     *
     * @return facilities
     */
    public ArrayList<String> getFacilities() {
        return facilities;
    }

    /**
     * This method sets value for facilities
     *
     * @param facilities
     */
    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }

    /**
     * This method returns an ArrayList of facilities of type String. This
     * method is used to add facility options taken from a String to an
     * ArrayList. Use comma as identifier and use split function to extract the
     * options and add the facilities to the list.
     *
     * @param options
     * @return facilities
     */
    public ArrayList<String> addFacilities(String options) {
        String op[] = options.split(",");
        for (int i = 0; i < op.length; i++) {
            facilities.add(op[i]);
        }
        return facilities;
    }

    /**
     * This method returns the basePrice of type double
     *
     * @return basePrice
     */
    public double calculateCost() {
        return basePrice;
    }

    /**
     * This method overrides the toString() of Ship class. The returned String
     * contains facilities.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        return "PassengerShip{" + "facilities=" + facilities + '}';
    }

}
