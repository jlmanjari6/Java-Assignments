/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * This is Route class.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public class Route {

    private String source;
    private String destination;
    private String departingDate;
    private String returningDate;

    /**
     * This is parameterized constructor.
     *
     * @param source
     * @param destination
     * @param departingDate
     * @param returningDate
     */
    public Route(String source, String destination, String departingDate, String returningDate) {
        this.source = source;
        this.destination = destination;
        this.departingDate = departingDate;
        this.returningDate = returningDate;
    }

    /**
     * This is get method to return source.
     *
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * This method sets the source value
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This is get method to return destination.
     *
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method sets the destination value
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * This is get method to return departing date.
     *
     * @return departing date.
     */
    public String getDepartingDate() {
        return departingDate;
    }

    /**
     * This method sets the departing date
     *
     * @param departingDate
     */
    public void setDepartingDate(String departingDate) {
        this.departingDate = departingDate;
    }

    /**
     * This method gets the returning date.
     *
     * @return returning date
     */
    public String getReturningDate() {
        return returningDate;
    }

    /**
     * This method sets the returning date.
     *
     * @param returningDate
     */
    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }

    /**
     * This method takes date as parameter in “mm/dd/yyyy” format and returns
     * DayOfWeek
     *
     * @param date - 
     * @return 
     */
    public DayOfWeek getDay(String date) {
        return LocalDate.of(Integer.parseInt(date.substring(6, 10)), Integer.parseInt(date.substring(0, 2)),
                Integer.parseInt(date.substring(3, 5))).getDayOfWeek();
    }

    /**
     * This method checks if any of the departingDate and returningDate is
     * weekend and returns true. Otherwise, false
     *
     * @return true or false
     */
    public boolean isWeekend() {
        return getDay(departingDate).equals(DayOfWeek.FRIDAY) || getDay(departingDate).equals(DayOfWeek.SATURDAY)
                || getDay(departingDate).equals(DayOfWeek.SUNDAY) || getDay(returningDate).equals(DayOfWeek.FRIDAY)
                || getDay(returningDate).equals(DayOfWeek.SATURDAY) || getDay(returningDate).equals(DayOfWeek.SUNDAY);
    }

    /**
     * This is toString method to return the formatted details.
     *
     * @return formatted details
     */
    @Override
    public String toString() {
        return "From: " + source + ", To: " + destination + ", Departing on: " + departingDate + ", Returning on: " + returningDate;
    }

}
