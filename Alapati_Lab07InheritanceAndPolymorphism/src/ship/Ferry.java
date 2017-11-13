/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;
import util.Utility;

/**
 * This is Ferry class inheriting the PassengerShip class, additionally holding
 * the time.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Ferry extends PassengerShip {

    private double time;

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
     * @param time
     */
    public Ferry(String manufacturerName, int modelSeries, String shipName,
            Point sourceLocation, Point destinationLocation, String model,
            double basePrice, double time) {
        super(manufacturerName, modelSeries, shipName, sourceLocation,
                destinationLocation, model, basePrice);
        this.time = time;
    }

    /**
     * This is no-argument constructor.
     */
    public Ferry() {

    }

    /**
     * This is get method to return time.
     *
     * @return time
     */
    public double getTime() {
        return time;
    }

    /**
     * This method sets the value for time.
     *
     * @param time
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * This method returns the speed of the ferry of type double. Speed can be
     * calculated based on the distance
     *
     * @return speed
     */
    public double getSpeed() {
        return Utility.getDistance(super.getSourceLocation(),
                super.getDestinationLocation()) / time;
    }

    /**
     * This method overrides the calculateCost() of PassengerShip class. This
     * method calculates the cost based upon the facilities which will be read
     * from the input file. The returned value will be the sum of basePrice and
     * the total cost calculated for the facilities.
     *
     * @return cost
     */
    @Override
    public double calculateCost() {
        double cost = 0.0;

        for (int i = 0; i < super.getFacilities().size(); i++) {
            cost += Facilities.valueOf(super.getFacilities().get(i).toUpperCase())
                    .getFacilityPrice();
        }

        cost += super.getBasePrice();
        return cost;
    }

    /**
     * This is toString method to print details
     *
     * @return formattedDetails.
     */
    @Override
    public String toString() {
        return "Ferry Name: " + getShipName() + ", " + getModel() + getModelSeries()
                + "\nThe Base price of ticket is: $" + getBasePrice()
                + "\nThe facilities chosen are " + super.getFacilities()
                + " and the total " + "cost is: $" + calculateCost()
                + "\nThe Speed at which the ferry is travelling:  "
                + String.format("%4.2f", getSpeed()) + "mph";
    }

}
