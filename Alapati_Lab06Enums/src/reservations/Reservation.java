/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This is Reservation class.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public class Reservation 
{
    private Route route;
    private Airline airline;
    private String cabin;
    private Hotel hotel;
    private Meal meal;

    /**
     * This is parameterized constructor.
     *
     * @param route
     * @param airline
     * @param cabin
     * @param hotel
     * @param meal
     */
    public Reservation(Route route, Airline airline, String cabin, Hotel hotel, Meal meal) 
    {
        this.route = route;
        this.airline = airline;
        this.cabin = cabin;
        this.hotel = hotel;
        this.meal = meal;
    }

    /**
     * This is get method to return route details.
     *
     * @return route
     */
    public Route getRoute() {
        return route;
    }

    /**
     * This method calculates the airline fare based on cabin (ECONOMY or
     * BUSINESS) and apply discount if both the returning and departure dates
     * are weekdays.
     *
     * @return total ticket price.
     */
    public double calcAirlinefare() {
        if (!route.isWeekend()) {
            return (cabin.toLowerCase().equals("economy"))
                    ? airline.getEconomyPrice() - airline.getEconomyPrice() * airline.getDiscount() / 100
                    : airline.getBusinessPrice() - airline.getBusinessPrice() * airline.getDiscount() / 100;
        } else {
            return (cabin.toLowerCase().equals("economy")) ? airline.getEconomyPrice() : airline.getBusinessPrice();
        }
    }

    /**
     * This method does not take any parameters and returns the value of room
     * cost of type double
     *
     * @return room cost.
     */
    public double calcRoomCost() {
        return hotel.getRoomCost();
    }

    /**
     * This method does not take any parameters and returns the value of meal
     * price of type double
     *
     * @return meal price
     */
    public double calcMealPrice() {
        return meal.getMealPrice();
    }

    /**
     * This method adds airline fare, room cost, and meal price.
     *
     * @return total fare including ticket, meal and hotel
     */
    public double calcTotalFare() {
        return calcAirlinefare() + calcRoomCost() + calcMealPrice();
    }

    /**
     * This is toString method to return the formatted details of a reservation.
     *
     * @return - It returns a formatted toString.
     */
    @Override
    public String toString() {
        return "From : " + route.getSource() + ", To : " + route.getDestination() + ", Departing On : "
                + route.getDepartingDate() + ", Returning On : " + route.getReturningDate()
                + ", Airline : " + airline + ", Cabin : " + cabin + ", Hotel : " + hotel + ", Meal : "
                + meal + ", Total fare : $" + calcTotalFare();
    }
}
