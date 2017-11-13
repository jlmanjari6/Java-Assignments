/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;

/**
 * This is Cruise class inheriting the PassengerShip class, additionally holding
 * the member name.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Cruise extends PassengerShip {

    /**
     * This is no-argument constructor.
     */
    public Cruise() {
        
    }

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
    public Cruise(String manufacturerName, int modelSeries, String shipName,
            Point sourceLocation, Point destinationLocation,
            String model, double basePrice) {
        super(manufacturerName, modelSeries, shipName, sourceLocation,
                destinationLocation, model, basePrice);
    }

    /**
     * This method overrides the calculateCost() of PassengerShip class. This
     * method calculates the cost based upon the facilities which will be read
     * from the input file. The returned value will be the sum of base price and
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
     * @return formattedString.
     */
    @Override
    public String toString() {
        return "Cruise Name: " + super.getShipName() + ", " + super.getModel()
                + super.getModelSeries() + "\n" + "The Base price of the ticket is: $"
                + super.getBasePrice() + "\nThe facilities chosen are: "
                + super.getFacilities() + " and the total cost calculated is: $"
                + calculateCost();
    }

}
